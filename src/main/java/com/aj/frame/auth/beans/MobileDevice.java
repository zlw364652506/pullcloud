package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  移动终端设备
 * @Description:移动终端设备
 * @author: chenzhirong
 * @date:2020-09-28 02:25:35
 * @version V1.0
 */
public class MobileDevice extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  
     */
	private Long iOrgObjId;
    /**
     *  对象主键id
     */
	private Long iUserInfoObjId;
    /**
     *  meid
     */
	private String meid;
    /**
     *  Imei
     */
	private String imei;
    /**
     *  终端型号
     */
	private String model;
    /**
     *  终端品牌
     */
	private String brand;
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


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getiOrgObjId(){
        return this.iOrgObjId;
    }
    public void setiOrgObjId(Long iOrgObjId){
        this.iOrgObjId = iOrgObjId;
    }
	public Long getiUserInfoObjId(){
        return this.iUserInfoObjId;
    }
    public void setiUserInfoObjId(Long iUserInfoObjId){
        this.iUserInfoObjId = iUserInfoObjId;
    }
	public String getMeid(){
        return this.meid;
    }
    public void setMeid(String meid){
        this.meid = meid;
    }
	public String getImei(){
        return this.imei;
    }
    public void setImei(String imei){
        this.imei = imei;
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

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
