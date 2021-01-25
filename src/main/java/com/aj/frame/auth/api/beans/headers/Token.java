package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 票据
 *
 * @author chenzhirong
 * @create 2020-08-17 10:29
 */
public class Token  extends AJFrameNamedBeanAbstract {

    /**
     * 票据 Id（128bit，32 个
     * 16 进制字符串表示，每
     * 个平台内部唯一）
     */
    private String tokenId;
    /**
     * 发行者 Id，平台隶属组织
     * 机构代码 GA380，12 位
     */
    private String orgId;
    /**
     * 扩展项，可空
     */
    private String exten;

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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
