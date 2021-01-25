package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  用户信息历史
 * @Description:用户信息历史
 * @author: chenzhirong
 * @date:2020-09-28 02:25:38
 * @version V1.0
 */
public class UserInfoHistory extends AJFrameNamedBeanAbstract {

    /**
     *   
     */
    private Long objId;

    /**
     *  用户Id（每个平台内部唯一）
     */
	private String userId;
    /**
     *  用户隶属组织机构代码GA380，12位
     */
	private String orgid;
    /**
     *  身份证号
     */
	private String sfzh;
    /**
     *  警号
     */
	private String jh;
    /**
     *  姓名
     */
	private String xm;
    /**
     *  扩展项，可空
     */
	private String exten;
    /**
     *  性别
     */
	private String sex;
    /**
     *  手机号
     */
	private String mobile;
    /**
     *  人员类型
     */
	private String personType;
    /**
     *  用户警种，汉字
     */
	private String police;
    /**
     *  用户职级，汉字
     */
	private String position;
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

	public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
	public String getOrgid(){
        return this.orgid;
    }
    public void setOrgid(String orgid){
        this.orgid = orgid;
    }
	public String getSfzh(){
        return this.sfzh;
    }
    public void setSfzh(String sfzh){
        this.sfzh = sfzh;
    }
	public String getJh(){
        return this.jh;
    }
    public void setJh(String jh){
        this.jh = jh;
    }
	public String getXm(){
        return this.xm;
    }
    public void setXm(String xm){
        this.xm = xm;
    }
	public String getExten(){
        return this.exten;
    }
    public void setExten(String exten){
        this.exten = exten;
    }
	public String getSex(){
        return this.sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
	public String getMobile(){
        return this.mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
	public String getPersonType(){
        return this.personType;
    }
    public void setPersonType(String personType){
        this.personType = personType;
    }
	public String getPolice(){
        return this.police;
    }
    public void setPolice(String police){
        this.police = police;
    }
	public String getPosition(){
        return this.position;
    }
    public void setPosition(String position){
        this.position = position;
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
