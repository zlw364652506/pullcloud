package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 认证服务器签名
 *
 * @author chenzhirong
 * @create 2020-08-17 10:39
 */
public class ServerSign  extends AJFrameNamedBeanAbstract {
    /**
     * 签名算法[SM3+SM2]
     */
    private String alg;
    /**
     * 签名值（对前两部分内容
     * head、load 去除空格、回
     * 车、换行、制表符等特殊
     * 字符按字节连接合并摘
     * 要后签名）]
     */
    private String signature;
    /**
     * 签名证书序列号
     */
    private String sn;
    /**
     * 验证服务器地址
     */
    private String url;


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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
