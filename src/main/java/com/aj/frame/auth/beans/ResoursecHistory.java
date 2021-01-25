package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  资源历史
 * @Description:资源历史
 * @author: chenzhirong
 * @date:2020-09-28 02:25:36
 * @version V1.0
 */
public class ResoursecHistory extends AJFrameNamedBeanAbstract {

    /**
     *   
     */
    private Long objId;

    /**
     *  资源id
     */
	private String resourceId;
    /**
     *  限定词内部标识：ZYBSQY；1-I类、2-II类、3-III类；
     */
	private Long networkAreaCode;
    /**
     *  限定词内部标识：ZYLX；1-I类资源、2-II类资源、3-III类资源；
     */
	private Long resourceType;
    /**
     *  限定词内部标识：ZYFWLX；1-摆渡交换、2-请求服务、3-授权方位；
     */
	private Long resourceServiceType;
    /**
     *  限定词内部标识：ZYCZLX；1-查询、2-写入、3-更新、4-删除；
     */
	private Long resourceOperatorType;
    /**
     *  限定词内部标识：ZYJKLX；11-HTTP、12-HTTPS、21-TCP、22-UDP；
     */
	private Long resourceInterfaceType;
    /**
     *  限定词内部标识：ZYJKDZ；
     */
	private String resourceInterfaceAddress;
    /**
     *  限定词内部标识：ZYMC；
     */
	private String resourceName;
    /**
     *  限定词内部标识：ZYSQFS；10-全公开、21-需由使用地授权、22-需由归属地授权、23-需由两地授权、31-需向使用地申请、32-需向归属地申请、33-需向两地申请；
     */
	private Long powerType;
    /**
     *  限定词内部标识：ZYZT；0-无效；1-启用、2-禁用、3-注销；
     */
	private Long status;
    /**
     *  类型 0-无；1-添加；2-修改；3-删除；
     */
	private Long auditType;
    /**
     *  创建时间
     */
	private Date createTime;
    /**
     *  更新时间
     */
	private Date updateTime;
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

	public String getResourceId(){
        return this.resourceId;
    }
    public void setResourceId(String resourceId){
        this.resourceId = resourceId;
    }
	public Long getNetworkAreaCode(){
        return this.networkAreaCode;
    }
    public void setNetworkAreaCode(Long networkAreaCode){
        this.networkAreaCode = networkAreaCode;
    }
	public Long getResourceType(){
        return this.resourceType;
    }
    public void setResourceType(Long resourceType){
        this.resourceType = resourceType;
    }
	public Long getResourceServiceType(){
        return this.resourceServiceType;
    }
    public void setResourceServiceType(Long resourceServiceType){
        this.resourceServiceType = resourceServiceType;
    }
	public Long getResourceOperatorType(){
        return this.resourceOperatorType;
    }
    public void setResourceOperatorType(Long resourceOperatorType){
        this.resourceOperatorType = resourceOperatorType;
    }
	public Long getResourceInterfaceType(){
        return this.resourceInterfaceType;
    }
    public void setResourceInterfaceType(Long resourceInterfaceType){
        this.resourceInterfaceType = resourceInterfaceType;
    }
	public String getResourceInterfaceAddress(){
        return this.resourceInterfaceAddress;
    }
    public void setResourceInterfaceAddress(String resourceInterfaceAddress){
        this.resourceInterfaceAddress = resourceInterfaceAddress;
    }
	public String getResourceName(){
        return this.resourceName;
    }
    public void setResourceName(String resourceName){
        this.resourceName = resourceName;
    }
	public Long getPowerType(){
        return this.powerType;
    }
    public void setPowerType(Long powerType){
        this.powerType = powerType;
    }
	public Long getStatus(){
        return this.status;
    }
    public void setStatus(Long status){
        this.status = status;
    }
	public Long getAuditType(){
        return this.auditType;
    }
    public void setAuditType(Long auditType){
        this.auditType = auditType;
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
