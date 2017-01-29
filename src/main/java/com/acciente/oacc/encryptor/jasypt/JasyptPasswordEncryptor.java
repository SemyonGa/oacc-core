/*
 * Copyright 2009-2017, Acciente LLC
 *
 * Acciente LLC licenses this file to you under the
 * Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in
 * writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.acciente.oacc.encryptor.jasypt;

import com.acciente.oacc.encryptor.PasswordEncryptor;
import org.jasypt.normalization.Normalizer;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class JasyptPasswordEncryptor implements PasswordEncryptor, Serializable {
   public static final String NAME = "jasypt";

   private static final String DEFAULT_ALGORITHM       = "SHA-256";
   private static final int    DEFAULT_ITERATIONS      = 100000;
   private static final int    DEFAULT_SALT_SIZE_BYTES = 16;

   private static final StandardByteDigesterPool digesterPool           = new StandardByteDigesterPool();
   private static final PasswordEncoderDecoder   passwordEncoderDecoder = new PasswordEncoderDecoder();

   private final String algorithm;
   private final int    iterations;
   private final int    saltSizeBytes;

   public static JasyptPasswordEncryptor getPasswordEncryptor() {
      return getPasswordEncryptor(DEFAULT_ALGORITHM, DEFAULT_ITERATIONS, DEFAULT_SALT_SIZE_BYTES);
   }

   public static JasyptPasswordEncryptor getPasswordEncryptor(String encryptAlgorithm,
                                                              int encryptIterations,
                                                              int encryptSaltSizeBytes) {
      return new JasyptPasswordEncryptor(encryptAlgorithm, encryptIterations, encryptSaltSizeBytes);
   }

   private JasyptPasswordEncryptor(String algorithm, int iterations, int saltSizeBytes) {
      this.algorithm = algorithm;
      this.iterations = iterations;
      this.saltSizeBytes = saltSizeBytes;
   }

   @Override
   public String encryptPassword(final char[] plainPassword) {
      if (plainPassword == null) {
         return null;
      }

      final byte[] digest = digesterPool.getStandardByteDigester(algorithm, iterations, saltSizeBytes)
            .digest(getCleanedBytes(plainPassword));

      return passwordEncoderDecoder.encodePassword(algorithm, iterations, saltSizeBytes, digest);
   }

   @Override
   public boolean checkPassword(final char[] plainPassword,
                                final String storedPassword) {
      if (plainPassword == null) {
         return (storedPassword == null);
      }
      else if (storedPassword == null) {
         return false;
      }

      final DecodedPassword decodedPassword = passwordEncoderDecoder.decodePassword(storedPassword);
      return digesterPool.getStandardByteDigester(decodedPassword.getAlgorithm(),
                                                  decodedPassword.getIterations(),
                                                  decodedPassword.getSaltSizeBytes())
            .matches(getCleanedBytes(plainPassword), decodedPassword.getDigest());
   }

   private static byte[] getCleanedBytes(char[] password) {
      final ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(CharBuffer.wrap(Normalizer.normalizeToNfc(password)));
      final byte[]     byteArray  = new byte[byteBuffer.remaining()];
      byteBuffer.get(byteArray);
      Arrays.fill(byteBuffer.array(), (byte) 0);
      return byteArray;
   }
}
