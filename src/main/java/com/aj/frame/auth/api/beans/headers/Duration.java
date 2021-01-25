package com.aj.frame.auth.api.beans.headers;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 凭证生存期限
 *
 * @author chenzhirong
 * @create 2020-08-17 10:32
 */
public class Duration  extends AJFrameNamedBeanAbstract {

    /**
     * 生效时间(时间戳，数字字
     * 符串)
     */
    private Long startTime;

    /**
     * 生效时间(时间戳，数字字
     * 符串)
     */
    private Long endTime;

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public String[] importantFieldValues() {
        return new String[0];
    }
}
