package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  组织机构历史
 * @Description:组织机构历史
 * @author: chenzhirong
 * @date:2020-09-28 02:25:36
 * @version V1.0
 */
public class OrgHistory extends AJFrameNamedBeanAbstract {

    /**
     *   
     */
    private Long objId;

    /**
     *  应用隶属组织机构（也即事权单位）代码GA380，12位
     */
	private String orgId;
    /**
     *  组织机构名称
     */
	private String orgName;
    /**
     *  上级机构对象id
     */
	private Long parentId;
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

	public String getOrgId(){
        return this.orgId;
    }
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }
	public String getOrgName(){
        return this.orgName;
    }
    public void setOrgName(String orgName){
        this.orgName = orgName;
    }
	public Long getParentId(){
        return this.parentId;
    }
    public void setParentId(Long parentId){
        this.parentId = parentId;
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
