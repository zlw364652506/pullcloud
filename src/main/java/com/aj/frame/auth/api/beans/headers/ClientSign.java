package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 认证对象（客户端）签名
 *
 * @author chenzhirong
 * @create 2020-08-17 10:41
 */
public class ClientSign extends AJFrameNamedBeanAbstract {
    /**
     * 签名算法[SM3+SM2]
     */
    private String alg;
    /**
     * 签名算法[SM3+SM2]
     */
    private String signature;
    /**
     * 签名算法[SM3+SM2]
     */
    private String sn;

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
