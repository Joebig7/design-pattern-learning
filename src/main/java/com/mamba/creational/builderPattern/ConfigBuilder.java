package com.mamba.creational.builderPattern;

import java.util.Objects;

/**
 * @author joe.zhang
 * @date 2020-09-28 18:42:14
 * Description: 构造者模式 类独立
 */
public class ConfigBuilder {
    private String resourceName;

    private Integer maxCount;

    private Long connectedTime;

    private Long keepLiveTime;


    public AbstractConfig builder() {

        if (Objects.isNull(resourceName)) {
            throw new RuntimeException("resourceName can't be null");
        }

        if (maxCount > Integer.MAX_VALUE) {
            throw new RuntimeException("maxCount can't be greater than MAX_VALUE");
        }

        return new AbstractConfig(this);
    }

    public ConfigBuilder resourceName(String resourceName) {
        this.resourceName = resourceName;

        return this;
    }

    public ConfigBuilder maxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    public ConfigBuilder connectedTime(Long connectedTime) {
        this.connectedTime = connectedTime;
        return this;
    }

    public ConfigBuilder keepLiveTime(Long keepLiveTime) {
        this.keepLiveTime = keepLiveTime;
        return this;
    }

    public String getResourceName() {
        return resourceName;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public Long getConnectedTime() {
        return connectedTime;
    }

    public Long getKeepLiveTime() {
        return keepLiveTime;
    }
}
