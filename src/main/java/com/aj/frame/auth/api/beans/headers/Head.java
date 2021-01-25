package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 头
 * @author chenzhirong
 * @create 2020-08-17 10:28
 */
public class Head  extends AJFrameNamedBeanAbstract {
    /**
     * 凭证格式版本（两节点分
     * 十进制数字 x.x），认证
     * 接口应支持所有版本
     */
    private String version;
    /**
     * 凭证类型(1.用户,2.应 用,3.资源)
     */
    private String credType;
    /**
     * 票据
     */
    private Token token;
    /**
     * 凭证生存期限
     */
    private Duration duration;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCredType() {
        return credType;
    }

    public void setCredType(String credType) {
        this.credType = credType;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
