package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  设备历史
 * @Description:设备历史
 * @author: chenzhirong
 * @date:2020-09-28 02:25:34
 * @version V1.0
 */
public class DeviceHistory extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  终端型号
     */
	private String model;
    /**
     *  终端品牌
     */
	private String brand;
    /**
     *  Imei
     */
	private String imei;
    /**
     *  操作系统名称
     */
	private String os;
    /**
     *  操作系统版本号
     */
	private String osVersion;
    /**
     *  序列号
     */
	private String seqNumber;
    /**
     *  手机号
     */
	private String phoneNumber;
    /**
     *  SIM卡号
     */
	private String simCard;
    /**
     *  电话号码
     */
	private String phoneNum;
    /**
     *  状态 0-失效；1-正常；
     */
	private Byte state;
    /**
     *  创建时间
     */
	private Date createTime;
    /**
     *  更新时间
     */
	private Date updateTime;
    /**
     *  设备ID,实体表唯一ID
     */
	private String deviceId;
    /**
     *  应用隶属组织机构（也即事权单位）代码GA380，12位
     */
	private String orgId;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
	public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
	public String getImei(){
        return this.imei;
    }
    public void setImei(String imei){
        this.imei = imei;
    }
	public String getOs(){
        return this.os;
    }
    public void setOs(String os){
        this.os = os;
    }
	public String getOsVersion(){
        return this.osVersion;
    }
    public void setOsVersion(String osVersion){
        this.osVersion = osVersion;
    }
	public String getSeqNumber(){
        return this.seqNumber;
    }
    public void setSeqNumber(String seqNumber){
        this.seqNumber = seqNumber;
    }
	public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
	public String getSimCard(){
        return this.simCard;
    }
    public void setSimCard(String simCard){
        this.simCard = simCard;
    }
	public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
	public Byte getState(){
        return this.state;
    }
    public void setState(Byte state){
        this.state = state;
    }
	public Date getCreateTime(){
        return this.createTime;
    }
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }
	public Date getUpdateTime(){
        return this.updateTime;
    }
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }
	public String getDeviceId(){
        return this.deviceId;
    }
    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }
	public String getOrgId(){
        return this.orgId;
    }
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
