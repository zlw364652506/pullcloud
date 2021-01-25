package com.aj.frame.auth.apibeans;

/**
 * 鉴权应用&资源 输入参数
 */
public class AppAndResourceAuthInput {
    /**
     * 应用Id
     */
    private String appId;

    /**
     * 应用归属机构
     */
    private String appRegionalismCode;

    /**
     * 资源ID
     */
    private String resourceId;

    /**
     * 资源归属机构
     */
    private String resourceRegionalismCode;


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppRegionalismCode() {
        return appRegionalismCode;
    }

    public void setAppRegionalismCode(String appRegionalismCode) {
        this.appRegionalismCode = appRegionalismCode;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceRegionalismCode() {
        return resourceRegionalismCode;
    }

    public void setResourceRegionalismCode(String resourceRegionalismCode) {
        this.resourceRegionalismCode = resourceRegionalismCode;
    }
}
