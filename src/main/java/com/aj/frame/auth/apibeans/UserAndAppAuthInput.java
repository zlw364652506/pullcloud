package com.aj.frame.auth.apibeans;

/**
 * 鉴权用户&应用 输入参数
 */
public class UserAndAppAuthInput {
    /**
     * 用户ID
     */
    private String personId;

    /**
     * 用户归属机构
     */
    private String personRegionalismCode;

    /**
     * 应用ID
     */
    private String appId;

    /**
     * 应用归属机构
     */
    private String appRegionalismCode;

    /**
     * 应用系统区域
     */
    private String networkAreaCOde;

    /**
     * 应用包名
     */
    private String appPackage;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonRegionalismCode() {
        return personRegionalismCode;
    }

    public void setPersonRegionalismCode(String personRegionalismCode) {
        this.personRegionalismCode = personRegionalismCode;
    }

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

    public String getNetworkAreaCOde() {
        return networkAreaCOde;
    }

    public void setNetworkAreaCOde(String networkAreaCOde) {
        this.networkAreaCOde = networkAreaCOde;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public void setAppPackage(String appPackage) {
        this.appPackage = appPackage;
    }
}
