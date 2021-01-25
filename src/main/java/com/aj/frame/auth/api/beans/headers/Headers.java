package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBean;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 请求头
 * @author chenzhirong
 * @create 2020-08-25 17:22
 */
public class Headers  extends AJFrameNamedBeanAbstract {

    private Credential userCredential;

    private Credential appCredential;

    private String messageId;

    public Credential getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(Credential userCredential) {
        this.userCredential = userCredential;
    }

    public Credential getAppCredential() {
        return appCredential;
    }

    public void setAppCredential(Credential appCredential) {
        this.appCredential = appCredential;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
