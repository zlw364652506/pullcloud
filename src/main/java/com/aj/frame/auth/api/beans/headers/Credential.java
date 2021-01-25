package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * @author chenzhirong
 * @create 2020-08-17 10:28
 */
public class Credential  extends AJFrameNamedBeanAbstract {
    /**
     * 头
     */
    private Head head;
    /**
     * 认证服务器签名
     */
    private ServerSign serverSign;
    /**
     * 认证对象（客户端）签名
     */
    private ClientSign clientSign;

    /**
     * 身份信息负载
     */
    private Load load;

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public ServerSign getServerSign() {
        return serverSign;
    }

    public void setServerSign(ServerSign serverSign) {
        this.serverSign = serverSign;
    }

    public ClientSign getClientSign() {
        return clientSign;
    }

    public void setClientSign(ClientSign clientSign) {
        this.clientSign = clientSign;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
