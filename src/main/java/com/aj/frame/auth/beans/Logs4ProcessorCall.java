package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  
 * @Description:
 * @author: chenzhirong
 * @date:2020-09-28 02:25:35
 * @version V1.0
 */
public class Logs4ProcessorCall extends AJFrameNamedBeanAbstract {


    /**
     *  
     */
	private String gid;
    /**
     *  
     */
	private String sid;
    /**
     *  
     */
	private String ci;
    /**
     *  
     */
	private String cid;
    /**
     *  
     */
	private String spidCode;
    /**
     *  
     */
	private String dpidMsg;
    /**
     *  
     */
	private String beanNum;
    /**
     *  
     */
	private String beanStr;
    /**
     *  
     */
	private String beanKey;
    /**
     *  
     */
	private String logTime;
    /**
     *  
     */
	private String ioType;
    /**
     *  
     */
	private String app;


	public String getGid(){
        return this.gid;
    }
    public void setGid(String gid){
        this.gid = gid;
    }
	public String getSid(){
        return this.sid;
    }
    public void setSid(String sid){
        this.sid = sid;
    }
	public String getCi(){
        return this.ci;
    }
    public void setCi(String ci){
        this.ci = ci;
    }
	public String getCid(){
        return this.cid;
    }
    public void setCid(String cid){
        this.cid = cid;
    }
	public String getSpidCode(){
        return this.spidCode;
    }
    public void setSpidCode(String spidCode){
        this.spidCode = spidCode;
    }
	public String getDpidMsg(){
        return this.dpidMsg;
    }
    public void setDpidMsg(String dpidMsg){
        this.dpidMsg = dpidMsg;
    }
	public String getBeanNum(){
        return this.beanNum;
    }
    public void setBeanNum(String beanNum){
        this.beanNum = beanNum;
    }
	public String getBeanStr(){
        return this.beanStr;
    }
    public void setBeanStr(String beanStr){
        this.beanStr = beanStr;
    }
	public String getBeanKey(){
        return this.beanKey;
    }
    public void setBeanKey(String beanKey){
        this.beanKey = beanKey;
    }
	public String getLogTime(){
        return this.logTime;
    }
    public void setLogTime(String logTime){
        this.logTime = logTime;
    }
	public String getIoType(){
        return this.ioType;
    }
    public void setIoType(String ioType){
        this.ioType = ioType;
    }
	public String getApp(){
        return this.app;
    }
    public void setApp(String app){
        this.app = app;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" };
    }
}
