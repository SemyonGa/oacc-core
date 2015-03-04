/*
 * Copyright 2009-2015, Acciente LLC
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
package com.acciente.oacc;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * AccessControlContextProxy
 * <p/>
 * This class is intended to be used as a proxy on an instance of the class that implements
 * AccessControlContext to restrict access to the methods defined in the
 * AccessControlContextProxy interface.
 *
 */
public class AccessControlContextProxy implements AccessControlContext {
   private AccessControlContext accessControlContext;

   @Override
   public void authenticate(Resource resource, Credentials credentials) {
      accessControlContext.authenticate(resource, credentials);
   }

   @Override
   public void authenticate(Resource resource) {
      accessControlContext.authenticate(resource);
   }

   @Override
   public void unauthenticate() {
      accessControlContext.unauthenticate();
   }

   @Override
   public void impersonate(Resource resource) {
      accessControlContext.impersonate(resource);
   }

   @Override
   public void unimpersonate() {
      accessControlContext.unimpersonate();
   }

   @Override
   public void setCredentials(Resource resource, Credentials newCredentials) {
      accessControlContext.setCredentials(resource, newCredentials);
   }

   @Override
   public void assertDomainPermissions(Resource accessorResource,
                                       String domainName,
                                       DomainPermission... domainPermissions) {
      accessControlContext.assertDomainPermissions(accessorResource, domainName, domainPermissions);
   }

   @Override
   public boolean hasDomainPermissions(Resource accessorResource,
                                       String domainName,
                                       DomainPermission... domainPermissions) {
      return accessControlContext.hasDomainPermissions(accessorResource, domainName, domainPermissions);
   }

   @Override
   public void assertDomainCreatePermissions(Resource accessorResource,
                                             DomainCreatePermission... domainCreatePermissions) {
      accessControlContext.assertDomainCreatePermissions(accessorResource, domainCreatePermissions);
   }

   @Override
   public boolean hasDomainCreatePermissions(Resource accessorResource,
                                             DomainCreatePermission... domainCreatePermissions) {
      return accessControlContext.hasDomainCreatePermissions(accessorResource, domainCreatePermissions);
   }

   @Override
   public void assertPostCreateDomainPermissions(Resource accessorResource,
                                                 DomainPermission domainPermission) {
      accessControlContext.assertPostCreateDomainPermissions(accessorResource, domainPermission);
   }

   @Override
   public boolean hasPostCreateDomainPermissions(Resource accessorResource,
                                                 DomainPermission domainPermission) {
      return accessControlContext.hasPostCreateDomainPermissions(accessorResource, domainPermission);
   }

   @Override
   public void assertGlobalResourcePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               ResourcePermission resourcePermission) {
      accessControlContext.assertGlobalResourcePermissions(accessorResource, resourceClassName, resourcePermission);
   }

   @Override
   public void assertGlobalResourcePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               String domainName,
                                               ResourcePermission resourcePermission) {
      accessControlContext.assertGlobalResourcePermissions(accessorResource, resourceClassName, domainName, resourcePermission);
   }

   @Override
   public boolean hasGlobalResourcePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               ResourcePermission resourcePermission) {
      return accessControlContext.hasGlobalResourcePermissions(accessorResource, resourceClassName, resourcePermission);
   }

   @Override
   public boolean hasGlobalResourcePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               String domainName,
                                               ResourcePermission resourcePermission) {
      return accessControlContext.hasGlobalResourcePermissions(accessorResource, resourceClassName, domainName, resourcePermission);
   }

   @Override
   public void assertResourcePermissions(Resource accessorResource,
                                         Resource accessedResource,
                                         ResourcePermission resourcePermission) {
      accessControlContext.assertResourcePermissions(accessorResource, accessedResource, resourcePermission);
   }

   @Override
   public boolean hasResourcePermissions(Resource accessorResource,
                                         Resource accessedResource,
                                         ResourcePermission resourcePermission) {
      return accessControlContext.hasResourcePermissions(accessorResource, accessedResource, resourcePermission);
   }

   @Override
   public void assertResourceCreatePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               ResourceCreatePermission resourceCreatePermission) {
      accessControlContext.assertResourceCreatePermissions(accessorResource, resourceClassName, resourceCreatePermission);
   }

   @Override
   public void assertResourceCreatePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               String domainName,
                                               ResourceCreatePermission resourceCreatePermission) {
      accessControlContext.assertResourceCreatePermissions(accessorResource, resourceClassName, domainName, resourceCreatePermission);
   }

   @Override
   public boolean hasResourceCreatePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               ResourceCreatePermission resourceCreatePermission) {
      return accessControlContext.hasResourceCreatePermissions(accessorResource, resourceClassName, resourceCreatePermission);
   }

   @Override
   public boolean hasResourceCreatePermissions(Resource accessorResource,
                                               String resourceClassName,
                                               String domainName,
                                               ResourceCreatePermission resourceCreatePermission) {
      return accessControlContext.hasResourceCreatePermissions(accessorResource, resourceClassName, domainName, resourceCreatePermission);
   }

   @Override
   public void assertPostCreateResourcePermissions(Resource accessorResource,
                                                   String resourceClassName,
                                                   ResourcePermission resourcePermission) {
      accessControlContext.assertPostCreateResourcePermissions(accessorResource, resourceClassName, resourcePermission);
   }

   @Override
   public void assertPostCreateResourcePermissions(Resource accessorResource,
                                                   String resourceClassName,
                                                   String domainName,
                                                   ResourcePermission resourcePermission) {
      accessControlContext.assertPostCreateResourcePermissions(accessorResource, resourceClassName, domainName, resourcePermission);
   }

   @Override
   public boolean hasPostCreateResourcePermissions(Resource accessorResource,
                                                   String resourceClassName,
                                                   ResourcePermission resourcePermission) {
      return accessControlContext.hasPostCreateResourcePermissions(accessorResource, resourceClassName, resourcePermission);
   }

   @Override
   public boolean hasPostCreateResourcePermissions(Resource accessorResource,
                                                   String resourceClassName,
                                                   String domainName,
                                                   ResourcePermission resourcePermission) {
      return accessControlContext.hasPostCreateResourcePermissions(accessorResource, resourceClassName, domainName, resourcePermission); }

   @Override
   public String getDomainNameByResource(Resource resource) {
      return accessControlContext.getDomainNameByResource(resource);
   }

   @Override
   public Set<String> getDomainDescendants(String domainName) {
      return accessControlContext.getDomainDescendants(domainName);
   }

   @Override
   public ResourceClassInfo getResourceClassInfo(String resourceClassName) {
      return accessControlContext.getResourceClassInfo(resourceClassName);
   }

   @Override
   public ResourceClassInfo getResourceClassInfoByResource(Resource resource) {
      return accessControlContext.getResourceClassInfoByResource(resource);
   }

   @Override
   public Set<Resource> getResourcesByResourcePermission(String resourceClassName,
                                                         ResourcePermission resourcePermission) {
      return accessControlContext.getResourcesByResourcePermission(resourceClassName, resourcePermission);
   }

   @Override
   public Set<Resource> getResourcesByResourcePermission(Resource accessorResource,
                                                         String resourceClassName,
                                                         ResourcePermission resourcePermission) {
      return accessControlContext.getResourcesByResourcePermission(accessorResource, resourceClassName, resourcePermission);
   }

   @Override
   public Set<Resource> getResourcesByResourcePermission(String resourceClassName,
                                                         ResourcePermission resourcePermission,
                                                         String domainName) {
      return accessControlContext.getResourcesByResourcePermission(resourceClassName, resourcePermission, domainName);
   }

   @Override
   public Set<Resource> getResourcesByResourcePermission(Resource accessorResource,
                                                         String resourceClassName,
                                                         ResourcePermission resourcePermission,
                                                         String domainName) {
      return accessControlContext.getResourcesByResourcePermission(accessorResource, resourceClassName, resourcePermission, domainName);
   }

   @Override
   public Set<Resource> getAccessorResourcesByResourcePermission(Resource accessedResource,
                                                                 String resourceClassName,
                                                                 ResourcePermission resourcePermission) {
      return accessControlContext.getAccessorResourcesByResourcePermission(accessedResource, resourceClassName, resourcePermission);
   }

   @Override
   public Resource getAuthenticatedResource() {
      return accessControlContext.getAuthenticatedResource();
   }

   @Override
   public Resource getSessionResource() {
      return accessControlContext.getSessionResource();
   }

   @Override
   public void createResourceClass(String resourceClassName,
                                   boolean authenticatable,
                                   boolean unauthenticatedCreateAllowed) {
      accessControlContext.createResourceClass(resourceClassName, authenticatable, unauthenticatedCreateAllowed);
   }

   @Override
   public void createResourcePermission(String resourceClassName, String permissionName) {
      accessControlContext.createResourcePermission(resourceClassName, permissionName);
   }

   @Override
   public void createDomain(String domainName) {
      accessControlContext.createDomain(domainName);
   }

   @Override
   public void createDomain(String domainName, String parentDomainName) {
      accessControlContext.createDomain(domainName, parentDomainName);
   }

   @Override
   public Resource createResource(String resourceClassName) {
      return accessControlContext.createResource(resourceClassName);
   }

   @Override
   public Resource createResource(String resourceClassName, String domainName) {
      return accessControlContext.createResource(resourceClassName, domainName);
   }

   @Override
   public Resource createResource(String resourceClassName, Credentials credentials) {
      return accessControlContext.createResource(resourceClassName, credentials);
   }

   @Override
   public Resource createResource(String resourceClassName,
                                  String domainName,
                                  Credentials credentials) {
      return accessControlContext.createResource(resourceClassName, domainName, credentials);
   }

   @Override
   public void setDomainCreatePermissions(Resource accessorResource,
                                          Set<DomainCreatePermission> domainCreatePermissions) {
      accessControlContext.setDomainCreatePermissions(accessorResource, domainCreatePermissions);
   }

   @Override
   public Set<DomainCreatePermission> getDomainCreatePermissions(Resource accessorResource) {
      return accessControlContext.getDomainCreatePermissions(accessorResource);
   }

   @Override
   public Set<DomainCreatePermission> getEffectiveDomainCreatePermissions(Resource accessorResource) {
      return accessControlContext.getEffectiveDomainCreatePermissions(accessorResource);
   }

   @Override
   public void setDomainPermissions(Resource accessorResource,
                                    String domainName,
                                    Set<DomainPermission> domainPermissions) {
      accessControlContext.setDomainPermissions(accessorResource, domainName, domainPermissions);
   }

   @Override
   public Set<DomainPermission> getDomainPermissions(Resource accessorResource,
                                                     String domainName) {
      return accessControlContext.getDomainPermissions(accessorResource, domainName);
   }

   @Override
   public Map<String, Set<DomainPermission>> getDomainPermissionsMap(Resource accessorResource) {
      return accessControlContext.getDomainPermissionsMap(accessorResource);
   }

   @Override
   public Set<DomainPermission> getEffectiveDomainPermissions(Resource accessorResource,
                                                              String domainName) {
      return accessControlContext.getEffectiveDomainPermissions(accessorResource, domainName);
   }

   @Override
   public Map<String, Set<DomainPermission>> getEffectiveDomainPermissionsMap(Resource accessorResource) {
      return accessControlContext.getEffectiveDomainPermissionsMap(accessorResource);
   }

   @Override
   public void setResourceCreatePermissions(Resource accessorResource,
                                            String resourceClassName,
                                            String domainName,
                                            Set<ResourceCreatePermission> resourceCreatePermissions) {
      accessControlContext.setResourceCreatePermissions(accessorResource, resourceClassName, domainName, resourceCreatePermissions);
   }

   @Override
   public Set<ResourceCreatePermission> getResourceCreatePermissions(Resource accessorResource,
                                                                     String resourceClassName,
                                                                     String domainName) {
      return accessControlContext.getResourceCreatePermissions(accessorResource, resourceClassName, domainName);
   }

   @Override
   public Set<ResourceCreatePermission> getEffectiveResourceCreatePermissions(Resource accessorResource,
                                                                              String resourceClassName,
                                                                              String domainName) {
      return accessControlContext.getEffectiveResourceCreatePermissions(accessorResource, resourceClassName, domainName);
   }

   @Override
   public void setResourceCreatePermissions(Resource accessorResource,
                                            String resourceClassName,
                                            Set<ResourceCreatePermission> resourceCreatePermissions) {
      accessControlContext.setResourceCreatePermissions(accessorResource, resourceClassName, resourceCreatePermissions);
   }

   @Override
   public Set<ResourceCreatePermission> getResourceCreatePermissions(Resource accessorResource,
                                                                     String resourceClassName) {
      return accessControlContext.getResourceCreatePermissions(accessorResource, resourceClassName);
   }

   @Override
   public Set<ResourceCreatePermission> getEffectiveResourceCreatePermissions(Resource accessorResource,
                                                                              String resourceClassName) {
      return accessControlContext.getEffectiveResourceCreatePermissions(accessorResource, resourceClassName);
   }

   @Override
   public Map<String, Map<String, Set<ResourceCreatePermission>>> getResourceCreatePermissionsMap(Resource accessorResource) {
      return accessControlContext.getResourceCreatePermissionsMap(accessorResource);
   }

   @Override
   public Map<String, Map<String, Set<ResourceCreatePermission>>> getEffectiveResourceCreatePermissionsMap(Resource accessorResource) {
      return accessControlContext.getEffectiveResourceCreatePermissionsMap(accessorResource);
   }

   @Override
   public void setResourcePermissions(Resource accessorResource,
                                      Resource accessedResource,
                                      Set<ResourcePermission> resourcePermissions) {
      accessControlContext.setResourcePermissions(accessorResource, accessedResource, resourcePermissions);
   }

   @Override
   public Set<ResourcePermission> getResourcePermissions(Resource accessorResource,
                                                         Resource accessedResource) {
      return accessControlContext.getResourcePermissions(accessorResource, accessedResource);
   }

   @Override
   public Set<ResourcePermission> getEffectiveResourcePermissions(Resource accessorResource,
                                                                  Resource accessedResource) {
      return accessControlContext.getEffectiveResourcePermissions(accessorResource, accessedResource);
   }

   @Override
   public void setGlobalResourcePermissions(Resource accessorResource,
                                            String resourceClassName,
                                            String domainName,
                                            Set<ResourcePermission> resourcePermissions) {
      accessControlContext.setGlobalResourcePermissions(accessorResource, resourceClassName, domainName, resourcePermissions);
   }

   @Override
   public Set<ResourcePermission> getGlobalResourcePermissions(Resource accessorResource,
                                                               String resourceClassName,
                                                               String domainName) {
      return accessControlContext.getGlobalResourcePermissions(accessorResource, resourceClassName, domainName);
   }

   @Override
   public Set<ResourcePermission> getEffectiveGlobalResourcePermissions(Resource accessorResource,
                                                                        String resourceClassName,
                                                                        String domainName) {
      return accessControlContext.getEffectiveGlobalResourcePermissions(accessorResource, resourceClassName, domainName);
   }

   @Override
   public void setGlobalResourcePermissions(Resource accessorResource,
                                            String resourceClassName,
                                            Set<ResourcePermission> resourcePermissions) {
      accessControlContext.setGlobalResourcePermissions(accessorResource, resourceClassName, resourcePermissions);
   }

   @Override
   public Set<ResourcePermission> getGlobalResourcePermissions(Resource accessorResource,
                                                               String resourceClassName) {
      return accessControlContext.getGlobalResourcePermissions(accessorResource, resourceClassName);
   }

   @Override
   public Set<ResourcePermission> getEffectiveGlobalResourcePermissions(Resource accessorResource,
                                                                        String resourceClassName) {
      return accessControlContext.getEffectiveGlobalResourcePermissions(accessorResource, resourceClassName);
   }

   @Override
   public Map<String, Map<String, Set<ResourcePermission>>> getGlobalResourcePermissionsMap(Resource accessorResource) {
      return accessControlContext.getGlobalResourcePermissionsMap(accessorResource);
   }

   @Override
   public Map<String, Map<String, Set<ResourcePermission>>> getEffectiveGlobalResourcePermissionsMap(Resource accessorResource) {
      return accessControlContext.getEffectiveGlobalResourcePermissionsMap(accessorResource);
   }

   @Override
   public List<String> getResourceClassNames() {
      return accessControlContext.getResourceClassNames();
   }

   @Override
   public List<String> getResourcePermissionNames(String resourceClassName) {
      return accessControlContext.getResourcePermissionNames(resourceClassName);
   }
}
