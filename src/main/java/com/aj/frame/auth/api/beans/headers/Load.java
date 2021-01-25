package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 身份信息负载
 *
 * @author chenzhirong
 * @create 2020-08-17 10:34
 */
public class Load  extends AJFrameNamedBeanAbstract {
    /**
     * 用户基本信息，与凭证类
     * 型匹配出现
     */
    private UserInfo userInfo;

    /**
     * 应用基本信息，与凭证类
     * 型匹配出现
     */
    private AppInfo appInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public AppInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
