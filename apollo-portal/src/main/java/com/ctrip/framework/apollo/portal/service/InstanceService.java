package com.ctrip.framework.apollo.portal.service;

import com.ctrip.framework.apollo.common.dto.PageDTO;
import com.ctrip.framework.apollo.core.enums.Env;

import com.ctrip.framework.apollo.portal.entity.Instance;
import com.ctrip.framework.apollo.portal.entity.InstanceConfig;
import com.ctrip.framework.apollo.portal.entity.Release;
import com.ctrip.framework.apollo.portal.repository.InstanceConfigRepository;
import com.ctrip.framework.apollo.portal.repository.InstanceRepository;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class InstanceService {


    @Autowired
    private InstanceConfigRepository instanceConfigRepository;

    @Autowired
    private InstanceRepository instanceRepository;
    @Autowired
    private ReleaseService releaseService;




    public Instance findInstance(String appId, String clusterName, String dataCenter, String ip) {
        return instanceRepository.findByAppIdAndClusterNameAndDataCenterAndIp(appId, clusterName,
                dataCenter, ip);
    }

/*    public List<Instance> findInstancesByIds(Set<Long> instanceIds) {
        Iterable<Instance> instances = instanceRepository.findAll(instanceIds);
        if (instances == null) {
            return Collections.emptyList();
        }
        return Lists.newArrayList(instances);
    }*/

    @Transactional
    public Instance createInstance(Instance instance) {
        instance.setId(0); //protection

        return instanceRepository.save(instance);
    }

    public InstanceConfig findInstanceConfig(long instanceId, String configAppId, String
            configNamespaceName) {
        return instanceConfigRepository
                .findByInstanceIdAndConfigAppIdAndConfigNamespaceName(
                        instanceId, configAppId, configNamespaceName);
    }

    public Page<InstanceConfig> findActiveInstanceConfigsByReleaseKey(String releaseKey, Pageable
            pageable) {
        Page<InstanceConfig> instanceConfigs = instanceConfigRepository
                .findByReleaseKeyAndDataChangeLastModifiedTimeAfter(releaseKey,
                        getValidInstanceConfigDate(), pageable);
        return instanceConfigs;
    }

    private Date getValidInstanceConfigDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        cal.add(Calendar.HOUR, -1);
        return cal.getTime();
    }

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


    @Transactional
    public InstanceConfig createInstanceConfig(InstanceConfig instanceConfig) {
        instanceConfig.setId(0); //protection

        return instanceConfigRepository.save(instanceConfig);
    }

    @Transactional
    public InstanceConfig updateInstanceConfig(InstanceConfig instanceConfig) {
        InstanceConfig existedInstanceConfig = instanceConfigRepository.findById(instanceConfig.getId()).get();
        Preconditions.checkArgument(existedInstanceConfig != null, String.format(
                "Instance config %d doesn't exist", instanceConfig.getId()));

        existedInstanceConfig.setConfigClusterName(instanceConfig.getConfigClusterName());
        existedInstanceConfig.setReleaseKey(instanceConfig.getReleaseKey());
        existedInstanceConfig.setReleaseDeliveryTime(instanceConfig.getReleaseDeliveryTime());
        existedInstanceConfig.setDataChangeLastModifiedTime(instanceConfig
                .getDataChangeLastModifiedTime());

        return instanceConfigRepository.save(existedInstanceConfig);
    }



}
