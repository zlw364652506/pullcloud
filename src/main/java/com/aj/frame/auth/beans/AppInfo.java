package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.util.List;
import java.lang.Long;

 /**
 * @Title:  应用
 * @Description:应用
 * @author: chenzhirong
 * @date:2020-09-28 02:25:33
 * @version V1.0
 */
public class AppInfo extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  对象主键id
     */
	private Long iCredentialObjId;
    /**
     *  
     */
	private Long iOrgObjId;
    /**
     *  应用Id （最大32个字符，每个平台内部唯一）
     */
	private String appId;
    /**
     *  应用隶属组织机构（也即事权单位）代码GA380，12位
     */
	private String orgId;
    /**
     *  应用包名
     */
	private String packageName;
    /**
     *  应用名称
     */
	private String name;
    /**
     *  1客户端/2服务端标识
     */
	private String csType;
    /**
     *  网络区域标识：1-Ⅰ类网络区域，2-Ⅱ类网络区域，3-Ⅲ类网络区域
     */
	private Long networkAreaCode;
    /**
     *  扩展
     */
	private String exten;
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
     *  10-全公开、21-需由使用地授权、22-需由归属地授权、23-需由两地授权、31-需向使用地申请、32-需向归属地申请、33-需向两地申请
     */
	private Long authType;
	
	private Org org;
	
	private  List <Resoursec> resoursec;
	
	

	public List<Resoursec> getResoursec() {
		return resoursec;
	}
	public void setResoursec(List<Resoursec> resoursec) {
		this.resoursec = resoursec;
	}
	public Org getOrg() {
		return org;
	}
	public void setOrg(Org org) {
		this.org = org;
	}
	public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getiCredentialObjId(){
        return this.iCredentialObjId;
    }
    public void setiCredentialObjId(Long iCredentialObjId){
        this.iCredentialObjId = iCredentialObjId;
    }
	public Long getiOrgObjId(){
        return this.iOrgObjId;
    }
    public void setiOrgObjId(Long iOrgObjId){
        this.iOrgObjId = iOrgObjId;
    }
	public String getAppId(){
        return this.appId;
    }
    public void setAppId(String appId){
        this.appId = appId;
    }
	public String getOrgId(){
        return this.orgId;
    }
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }
	public String getPackageName(){
        return this.packageName;
    }
    public void setPackageName(String packageName){
        this.packageName = packageName;
    }
	public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
	public String getCsType(){
        return this.csType;
    }
    public void setCsType(String csType){
        this.csType = csType;
    }
	public Long getNetworkAreaCode(){
        return this.networkAreaCode;
    }
    public void setNetworkAreaCode(Long networkAreaCode){
        this.networkAreaCode = networkAreaCode;
    }
	public String getExten(){
        return this.exten;
    }
    public void setExten(String exten){
        this.exten = exten;
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
	public Long getAuthType(){
        return this.authType;
    }
    public void setAuthType(Long authType){
        this.authType = authType;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
