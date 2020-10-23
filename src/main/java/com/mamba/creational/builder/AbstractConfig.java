package com.mamba.creational.builder;

/**
 * @author joe.zhang
 * @date 2020-09-28 17:50:12
 * Description: 配置类
 */
public class AbstractConfig {

    private String resourceName;

    private Integer maxCount;

    private Long connectedTime;

    private Long keepLiveTime;

    public AbstractConfig(ConfigBuilder builder) {
        this.resourceName = builder.getResourceName();
        this.maxCount = builder.getMaxCount();
        this.connectedTime = builder.getConnectedTime();
        this.keepLiveTime = builder.getKeepLiveTime();
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

    public static void main(String[] args) {
        //创建AbstractConfig对象
        AbstractConfig abstractConfig = new ConfigBuilder().connectedTime(1000L).maxCount(100).keepLiveTime(10000L).resourceName("com.test").builder();

        System.out.println(abstractConfig.getMaxCount());

    }
}
