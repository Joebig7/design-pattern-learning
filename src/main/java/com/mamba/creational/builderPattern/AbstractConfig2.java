package com.mamba.creational.builderPattern;

import javax.swing.*;
import java.util.Objects;

/**
 * @author joe.zhang
 * @date 2020-09-28 19:08:53
 * Description: 内部类的形式
 */
public class AbstractConfig2 {

    private String resourceName;

    private Integer maxCount;

    private Long connectedTime;

    private Long keepLiveTime;

    public AbstractConfig2(ConfigBuilder builder) {
        this.resourceName = builder.resourceName;
        this.maxCount = builder.maxCount;
        this.connectedTime = builder.connectedTime;
        this.keepLiveTime = builder.keepLiveTime;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public Long getConnectedTime() {
        return connectedTime;
    }

    public void setConnectedTime(Long connectedTime) {
        this.connectedTime = connectedTime;
    }

    public Long getKeepLiveTime() {
        return keepLiveTime;
    }

    public void setKeepLiveTime(Long keepLiveTime) {
        this.keepLiveTime = keepLiveTime;
    }

    public static class ConfigBuilder {
        private String resourceName;

        private Integer maxCount;

        private Long connectedTime;

        private Long keepLiveTime;


        public AbstractConfig2 builder() {

            if (Objects.isNull(resourceName)) {
                throw new RuntimeException("resourceName can't be null");
            }

            if (maxCount > Integer.MAX_VALUE) {
                throw new RuntimeException("maxCount can't be greater than MAX_VALUE");
            }

            return new AbstractConfig2(this);
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
    }

    public static void main(String[] args) {
        //创建AbstractConfig对象
        AbstractConfig2 abstractConfig2 = new AbstractConfig2.ConfigBuilder().connectedTime(1000L).maxCount(100).keepLiveTime(10000L).resourceName("com.test").builder();
        System.out.println(abstractConfig2.connectedTime);
    }

}
