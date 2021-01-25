package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBean;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 应用基本信息，与凭证类
 * 型匹配出现
 *
 * @author chenzhirong
 * @create 2020-08-17 10:37
 */
public class AppInfo extends AJFrameNamedBeanAbstract {

    /**
     * 应用Id （最大32个字符，
     * 每个平台内部唯一）
     */
    private String appId;
    /**
     * 应用隶属组织机构（也即
     * 事权单位）代码 GA380，
     * 12 位
     */
    private String orgId;
    /**
     * 应用包名
     */
    private String packageName;
    /**
     * 应用名称
     */
    private String name;
    /**
     * 1 客户端/2 服务端标识
     */
    private String csType;
    /**
     * 网络区域标识：1-Ⅰ类网
     * 络区域，2-Ⅱ类网络区
     * 域，3-Ⅲ类网络区域
     */
    private String networkAreaCode;
    /**
     * 扩展项
     */
    private String exten;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCsType() {
        return csType;
    }

    public void setCsType(String csType) {
        this.csType = csType;
    }

    public String getNetworkAreaCode() {
        return networkAreaCode;
    }

    public void setNetworkAreaCode(String networkAreaCode) {
        this.networkAreaCode = networkAreaCode;
    }

    public String getExten() {
        return exten;
    }

    public void setExten(String exten) {
        this.exten = exten;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
