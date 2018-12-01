//package com.ctrip.framework.apollo.portal.api;
//
//
//import com.ctrip.framework.apollo.bo.ItemChangeSets;
//import com.ctrip.framework.apollo.common.dto.*;
//import com.ctrip.framework.apollo.core.enums.Env;
//import com.ctrip.framework.apollo.portal.entity.Item;
//import com.ctrip.framework.apollo.portal.entity.Namespace;
//import com.ctrip.framework.apollo.portal.entity.Release;
//import com.google.common.base.Joiner;
//import org.springframework.boot.actuate.health.Health;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//
//@Service
//public class AdminServiceAPI {
//
//    @Service
//    public static class HealthAPI extends API {
//
//        public Health health(Env env) {
////      return restTemplate.get(env, "/health", Health.class);
//            return null;
//        }
//    }
//
//    @Service
//    public static class AppAPI extends API {
//
//        public AppDTO loadApp(Env env, String appId) {
////      return restTemplate.get(env, "apps/{appId}", AppDTO.class, appId);
//            return null;
//        }
//
//        public AppDTO createApp(Env env, AppDTO app) {
////      return restTemplate.post(env, "apps", app, AppDTO.class);
//            return null;
//        }
//
//        public void updateApp(Env env, AppDTO app) {
////      restTemplate.put(env, "apps/{appId}", app, app.getAppId());
//            return;
//        }
//
//        public void deleteApp(Env env, String appId, String operator) {
////      restTemplate.delete(env, "/apps/{appId}?operator={operator}", appId, operator);
//            return;
//        }
//    }
//
//
//    @Service
//    public static class NamespaceAPI extends API {
//
//        private ParameterizedTypeReference<Map<String, Boolean>>
//                typeReference = new ParameterizedTypeReference<Map<String, Boolean>>() {
//        };
//
//        public List<Namespace> findNamespaceByCluster(String appId, Env env, String clusterName) {
////      NamespaceDTO[] namespaceDTOs = restTemplate.get(env, "apps/{appId}/clusters/{clusterName}/namespaces",
////          NamespaceDTO[].class, appId,
////          clusterName);
////      return Arrays.asList(namespaceDTOs);
//            return null;
//        }
//
//        public Namespace loadNamespace(String appId, Env env, String clusterName,
//                                          String namespaceName) {
////      return
////          restTemplate.get(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}",
////              NamespaceDTO.class, appId, clusterName, namespaceName);
//            return null;
//        }
//
//        public Namespace findPublicNamespaceForAssociatedNamespace(Env env, String appId, String clusterName,
//                                                                      String namespaceName) {
////      return
////          restTemplate
////              .get(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/associated-public-namespace",
////                  NamespaceDTO.class, appId, clusterName, namespaceName);
//            return null;
//        }
//
//        public Namespace createNamespace(Env env, Namespace namespace) {
////      return restTemplate
////          .post(env, "apps/{appId}/clusters/{clusterName}/namespaces", namespace, NamespaceDTO.class,
////              namespace.getAppId(), namespace.getClusterName());
//            return null;
//        }
//
//        public AppNamespaceDTO createAppNamespace(Env env, AppNamespaceDTO appNamespace) {
////      return restTemplate
////          .post(env, "apps/{appId}/appnamespaces", appNamespace, AppNamespaceDTO.class, appNamespace.getAppId());
//            return null;
//        }
//
//        public void deleteNamespace(Env env, String appId, String clusterName, String namespaceName, String operator) {
////      restTemplate
////          .delete(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}?operator={operator}", appId,
////              clusterName,
////              namespaceName, operator);
//            return;
//        }
//
//        public Map<String, Boolean> getNamespacePublishInfo(Env env, String appId) {
////      return restTemplate.get(env, "apps/{appId}/namespaces/publish_info", typeReference, appId).getBody();
//            return null;
//        }
//
//        public List<Namespace> getPublicAppNamespaceAllNamespaces(Env env, String publicNamespaceName,
//                                                                     int page, int size) {
////      NamespaceDTO[] namespaceDTOs =
////          restTemplate.get(env, "/appnamespaces/{publicNamespaceName}/namespaces?page={page}&size={size}",
////              NamespaceDTO[].class, publicNamespaceName, page, size);
////      return Arrays.asList(namespaceDTOs);
//            return null;
//        }
//
//        public int countPublicAppNamespaceAssociatedNamespaces(Env env, String publicNamesapceName) {
////      Integer count =
////          restTemplate.get(env, "/appnamespaces/{publicNamespaceName}/associated-namespaces/count", Integer.class,
////              publicNamesapceName);
////
////      return count == null ? 0 : count;
//            return 0;
//        }
//
//        public void deleteAppNamespace(Env env, String appId, String namespaceName, String operator) {
////      restTemplate.delete(env, "/apps/{appId}/appnamespaces/{namespaceName}?operator={operator}", appId, namespaceName,
////          operator);
//        }
//    }
//
//    @Service
//    public static class ItemAPI extends API {
//
//        public List<Item> findItems(String appId, Env env, String clusterName, String namespaceName) {
////      Item[] Items =
////          restTemplate.get(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items",
////              Item[].class, appId, clusterName, namespaceName);
////      return Arrays.asList(Items);
//            return null;
//        }
//
//        public Item loadItem(Env env, String appId, String clusterName, String namespaceName, String key) {
////      return restTemplate.get(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{key}",
////          Item.class, appId, clusterName, namespaceName, key);
//            return null;
//
//        }
//
//        public void updateItemsByChangeSet(String appId, Env env, String clusterName, String namespace,
//                                           ItemChangeSets changeSets) {
////      restTemplate.post(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/itemset",
////          changeSets, Void.class, appId, clusterName, namespace);
//            return;
//        }
//
//        public void updateItem(String appId, Env env, String clusterName, String namespace, long itemId, Item item) {
////      restTemplate.put(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items/{itemId}",
////          item, appId, clusterName, namespace, itemId);
//            return;
//
//        }
//
//        public Item createItem(String appId, Env env, String clusterName, String namespace, Item item) {
////      return restTemplate.post(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/items",
////          item, Item.class, appId, clusterName, namespace);
//            return null;
//        }
//
//        public void deleteItem(Env env, long itemId, String operator) {
//
////      restTemplate.delete(env, "items/{itemId}?operator={operator}", itemId, operator);
//            return;
//        }
//    }
//
//    @Service
//    public static class ClusterAPI extends API {
//
//        public List<ClusterDTO> findClustersByApp(String appId, Env env) {
////      ClusterDTO[] clusterDTOs = restTemplate.get(env, "apps/{appId}/clusters", ClusterDTO[].class,
////          appId);
////      return Arrays.asList(clusterDTOs);
//            return null;
//        }
//
//        public ClusterDTO loadCluster(String appId, Env env, String clusterName) {
////      return restTemplate.get(env, "apps/{appId}/clusters/{clusterName}", ClusterDTO.class,
////          appId, clusterName);
//            return null;
//        }
//
//        public boolean isClusterUnique(String appId, Env env, String clusterName) {
////      return restTemplate
////          .get(env, "apps/{appId}/cluster/{clusterName}/unique", Boolean.class,
////              appId, clusterName);
//            return false;
//
//        }
//
//        public ClusterDTO create(Env env, ClusterDTO cluster) {
////      return restTemplate.post(env, "apps/{appId}/clusters", cluster, ClusterDTO.class,
////          cluster.getAppId());
//            return null;
//        }
//
//
//        public void delete(Env env, String appId, String clusterName, String operator) {
////      restTemplate.delete(env, "apps/{appId}/clusters/{clusterName}?operator={operator}", appId, clusterName, operator);
//            return;
//        }
//    }
//
//    @Service
//    public static class ReleaseAPI extends API {
//
//        private static final Joiner JOINER = Joiner.on(",");
//
//        public Release loadRelease(Env env, long releaseId) {
////      return restTemplate.get(env, "releases/{releaseId}", Release.class, releaseId);
//            return null;
//        }
//
//        public List<Release> findReleaseByIds(Env env, Set<Long> releaseIds) {
////      if (CollectionUtils.isEmpty(releaseIds)) {
////        return Collections.emptyList();
////      }
////
////      Release[]
////          releases =
////          restTemplate.get(env, "/releases?releaseIds={releaseIds}", Release[].class, JOINER.join(releaseIds));
////      return Arrays.asList(releases);
//            return null;
//
//        }
//
//        public List<Release> findAllReleases(String appId, Env env, String clusterName, String namespaceName, int page,
//                                                int size) {
////      Release[] Releases = restTemplate.get(
////          env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/all?page={page}&size={size}",
////          Release[].class,
////          appId, clusterName, namespaceName, page, size);
////      return Arrays.asList(Releases);
//            return null;
//        }
//
//        public List<Release> findActiveReleases(String appId, Env env, String clusterName, String namespaceName,
//                                                   int page,
//                                                   int size) {
////      Release[] Releases = restTemplate.get(
////          env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/active?page={page}&size={size}",
////          Release[].class,
////          appId, clusterName, namespaceName, page, size);
////      return Arrays.asList(Releases);
//            return null;
//        }
//
//        public Release loadLatestRelease(String appId, Env env, String clusterName,
//                                            String namespace) {
////      Release Release = restTemplate
////          .get(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/latest",
////              Release.class, appId, clusterName, namespace);
////      return Release;
//            return null;
//        }
//
//        public Release createRelease(String appId, Env env, String clusterName, String namespace,
//                                        String releaseName, String releaseComment, String operator,
//                                        boolean isEmergencyPublish) {
////      HttpHeaders headers = new HttpHeaders();
////      headers.setContentType(MediaType.parseMediaType(MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8"));
////      MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
////      parameters.add("name", releaseName);
////      parameters.add("comment", releaseComment);
////      parameters.add("operator", operator);
////      parameters.add("isEmergencyPublish", String.valueOf(isEmergencyPublish));
////      HttpEntity<MultiValueMap<String, String>> entity =
////          new HttpEntity<>(parameters, headers);
////      Release response = restTemplate.post(
////          env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases", entity,
////          Release.class, appId, clusterName, namespace);
////      return response;
//            return null;
//        }
//
//        public Release createGrayDeletionRelease(String appId, Env env, String clusterName, String namespace,
//                                                    String releaseName, String releaseComment, String operator,
//                                                    boolean isEmergencyPublish, Set<String> grayDelKeys) {
////      HttpHeaders headers = new HttpHeaders();
////      headers.setContentType(MediaType.parseMediaType(MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8"));
////      MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
////      parameters.add("releaseName", releaseName);
////      parameters.add("comment", releaseComment);
////      parameters.add("operator", operator);
////      parameters.add("isEmergencyPublish", String.valueOf(isEmergencyPublish));
////      grayDelKeys.forEach(key ->{
////        parameters.add("grayDelKeys",key);
////      });
////      HttpEntity<MultiValueMap<String, String>> entity =
////              new HttpEntity<>(parameters, headers);
////      Release response = restTemplate.post(
////              env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/gray-del-releases", entity,
////              Release.class, appId, clusterName, namespace);
////      return response;
//            return null;
//        }
//
//        public Release updateAndPublish(String appId, Env env, String clusterName, String namespace,
//                                           String releaseName, String releaseComment, String branchName,
//                                           boolean isEmergencyPublish, boolean deleteBranch, ItemChangeSets changeSets) {
//
////      return restTemplate.post(env,
////          "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/updateAndPublish?"
////              + "releaseName={releaseName}&releaseComment={releaseComment}&branchName={branchName}"
////              + "&deleteBranch={deleteBranch}&isEmergencyPublish={isEmergencyPublish}",
////          changeSets, Release.class, appId, clusterName, namespace,
////          releaseName, releaseComment, branchName, deleteBranch, isEmergencyPublish);
//            return null;
//
//        }
//
//        public void rollback(Env env, long releaseId, String operator) {
////      restTemplate.put(env,
////          "releases/{releaseId}/rollback?operator={operator}",
////          null, releaseId, operator);
//            return;
//        }
//    }
//
//    @Service
//    public static class CommitAPI extends API {
//
//        public List<CommitDTO> find(String appId, Env env, String clusterName, String namespaceName, int page, int size) {
//
////      CommitDTO[] commitDTOs = restTemplate.get(env,
////          "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/commit?page={page}&size={size}",
////          CommitDTO[].class,
////          appId, clusterName, namespaceName, page, size);
////
////      return Arrays.asList(commitDTOs);
//            return null;
//        }
//    }
//
//    @Service
//    public static class NamespaceLockAPI extends API {
//
//        public NamespaceLockDTO getNamespaceLockOwner(String appId, Env env, String clusterName, String namespaceName) {
////      return restTemplate.get(env, "apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/lock",
////          NamespaceLockDTO.class,
////          appId, clusterName, namespaceName);
//            return null;
//        }
//    }
//
//    @Service
//    public static class InstanceAPI extends API {
//
//        private Joiner joiner = Joiner.on(",");
//        private ParameterizedTypeReference<PageDTO<InstanceDTO>>
//                pageInstanceDtoType =
//                new ParameterizedTypeReference<PageDTO<InstanceDTO>>() {
//                };
//
//        public PageDTO<InstanceDTO> getByRelease(Env env, long releaseId, int page, int size) {
////      ResponseEntity<PageDTO<InstanceDTO>>
////          entity =
////          restTemplate
////              .get(env, "/instances/by-release?releaseId={releaseId}&page={page}&size={size}", pageInstanceDtoType,
////                  releaseId, page, size);
////      return entity.getBody();
//            return null;
//
//        }
//
//        public List<InstanceDTO> getByReleasesNotIn(String appId, Env env, String clusterName, String namespaceName,
//                                                    Set<Long> releaseIds) {
////
////      InstanceDTO[]
////          instanceDTOs =
////          restTemplate.get(env,
////              "/instances/by-namespace-and-releases-not-in?appId={appId}&clusterName={clusterName}&namespaceName={namespaceName}&releaseIds={releaseIds}",
////              InstanceDTO[].class, appId, clusterName, namespaceName, joiner.join(releaseIds));
//
////      return Arrays.asList(instanceDTOs);
//            return null;
//        }
//
//        public PageDTO<InstanceDTO> getByNamespace(String appId, Env env, String clusterName, String namespaceName,
//                                                   String instanceAppId,
//                                                   int page, int size) {
////      ResponseEntity<PageDTO<InstanceDTO>>
////          entity =
////          restTemplate.get(env,
////              "/instances/by-namespace?appId={appId}"
////                  + "&clusterName={clusterName}&namespaceName={namespaceName}&instanceAppId={instanceAppId}"
////                  + "&page={page}&size={size}",
////              pageInstanceDtoType, appId, clusterName, namespaceName, instanceAppId, page, size);
////      return entity.getBody();
//            return null;
//        }
//
//        public int getInstanceCountByNamespace(String appId, Env env, String clusterName, String namespaceName) {
////      Integer
////          count =
////          restTemplate.get(env,
////              "/instances/by-namespace/count?appId={appId}&clusterName={clusterName}&namespaceName={namespaceName}",
////              Integer.class, appId, clusterName, namespaceName);
////      if (count == null) {
////        return 0;
////      }
////      return count;
////    }
//            return 0;
//        }
//
//        @Service
//        public static class NamespaceBranchAPI extends API {
//
//            public Namespace createBranch(String appId, Env env, String clusterName,
//                                             String namespaceName, String operator) {
////      return restTemplate
////          .post(env, "/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches?operator={operator}",
////              null, NamespaceDTO.class, appId, clusterName, namespaceName, operator);
//                return null;
//            }
//
//            public Namespace findBranch(String appId, Env env, String clusterName,
//                                        String namespaceName) {
////      return restTemplate.get(env, "/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches",
////          NamespaceDTO.class, appId, clusterName, namespaceName);
//                return null;
//            }
//
//            public GrayReleaseRuleDTO findBranchGrayRules(String appId, Env env, String clusterName,
//                                                          String namespaceName, String branchName) {
////      return restTemplate
////          .get(env, "/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules",
////              GrayReleaseRuleDTO.class, appId, clusterName, namespaceName, branchName);
//                return null;
//
//            }
//
//            public void updateBranchGrayRules(String appId, Env env, String clusterName,
//                                              String namespaceName, String branchName, GrayReleaseRuleDTO rules) {
////      restTemplate
////          .put(env, "/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}/rules",
////              rules, appId, clusterName, namespaceName, branchName);
//                return;
//
//            }
//
//            public void deleteBranch(String appId, Env env, String clusterName,
//                                     String namespaceName, String branchName, String operator) {
////      restTemplate.delete(env,
////          "/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}?operator={operator}",
////          appId, clusterName, namespaceName, branchName, operator);
//                return;
//            }
//        }
//
//        @Service
//        public static class ReleaseHistoryAPI extends API {
//
//            private ParameterizedTypeReference<PageDTO<ReleaseHistoryDTO>> type =
//                    new ParameterizedTypeReference<PageDTO<ReleaseHistoryDTO>>() {
//                    };
//
//
//            public PageDTO<ReleaseHistoryDTO> findReleaseHistoriesByNamespace(String appId, Env env, String clusterName,
//                                                                              String namespaceName, int page, int size) {
////      return restTemplate.get(env,
////          "/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/releases/histories?page={page}&size={size}",
////          type, appId, clusterName, namespaceName, page, size).getBody();
//                return null;
//            }
//
//            public PageDTO<ReleaseHistoryDTO> findByReleaseIdAndOperation(Env env, long releaseId, int operation, int page,
//                                                                          int size) {
////      return restTemplate.get(env,
////          "/releases/histories/by_release_id_and_operation?releaseId={releaseId}&operation={operation}&page={page}&size={size}",
////          type, releaseId, operation, page, size).getBody();
//                return null;
//            }
//
//            public PageDTO<ReleaseHistoryDTO> findByPreviousReleaseIdAndOperation(Env env, long previousReleaseId,
//                                                                                  int operation, int page, int size) {
////      return restTemplate.get(env,
////          "/releases/histories/by_previous_release_id_and_operation?previousReleaseId={releaseId}&operation={operation}&page={page}&size={size}",
////          type, previousReleaseId, operation, page, size).getBody();
//                return null;
//            }
//
//        }
//
//    }
//}