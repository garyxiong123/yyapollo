package com.ctrip.framework.apollo.portal.service;

import com.ctrip.framework.apollo.common.dto.PageDTO;
import com.ctrip.framework.apollo.core.enums.Env;

import com.ctrip.framework.apollo.portal.entity.Instance;
import com.ctrip.framework.apollo.portal.entity.Release;
import com.ctrip.framework.apollo.portal.repository.InstanceConfigRepository;
import com.ctrip.framework.apollo.portal.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class InstanceService {


    @Autowired
    private InstanceConfigRepository instanceConfigRepository;

    @Autowired
    private InstanceRepository instanceRepository;
    @Autowired
    private ReleaseService releaseService;

    public PageDTO<Instance> getByRelease(Env env, long releaseId, int page, int size) {
        Release release = releaseService.findReleaseById(env, releaseId);
        return null;
    }

    public PageDTO<Instance> getByNamespace(Env env, String appId, String clusterName, String namespaceName,
                                            String instanceAppId, int page, int size) {
//    return instanceAPI.getByNamespace(appId, env, clusterName, namespaceName, instanceAppId, page, size);
        return null;
    }

    public int getInstanceCountByNamepsace(String appId, Env env, String clusterName, String namespaceName) {

        return instanceRepository.countByAppIdAndEnvAndClusterName(appId, env.name(), clusterName);
    }

    public List<Instance> getByReleasesNotIn(Env env, String appId, String clusterName, String namespaceName, Set<Long> releaseIds) {
//    return instanceAPI.getByReleasesNotIn(appId, env, clusterName, namespaceName, releaseIds);
        return null;
    }


    @Transactional
    public int batchDeleteInstanceConfig(String configAppId, String configClusterName, String configNamespaceName) {
        return instanceConfigRepository.batchDelete(configAppId, configClusterName, configNamespaceName);
    }


}
