package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * @author chenzhirong
 * @create 2020-08-17 10:35
 */
public class UserInfo  extends AJFrameNamedBeanAbstract {

    /**
     * 用户 Id
     */
    private String userId;
    /**
     * 用户隶属组织机构代码
     * GA380，12 位
     */
    private String orgId;
    /**
     * 身份证号
     */
    private String sfzh;
    /**
     * 警号
     */
    private String jh;
    /**
     * 姓名
     */
    private String xm;
    /**
     * 扩展项
     */
    private String exten;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getJh() {
        return jh;
    }

    public void setJh(String jh) {
        this.jh = jh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
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
