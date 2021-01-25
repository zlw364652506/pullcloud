package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  申请表
 * @Description:申请表
 * @author: chenzhirong
 * @date:2020-09-28 02:25:37
 * @version V1.0
 */
public class Table extends AJFrameNamedBeanAbstract {

    /**
     *   主键
     */
    private Long objId;

    /**
     *  标题
     */
	private String title;
    /**
     *  创建人
     */
	private Long createUserId;
    /**
     *  创建人姓名
     */
	private String createUserName;
    /**
     *  创建人部门代码
     */
	private String createUserDept;
    /**
     *  10-全公开、21-需由使用地授权、22-需由归属地授权、23-需由两地授权、31-需向使用地申请、32-需向归属地申请、33-需向两地申请 11 动态授权  12 委托授权  99 自动授权
     */
	private Long authType;
    /**
     *  创建时间
     */
	private Date createTime;
    /**
     *  更新时间
     */
	private Date updateTime;
    /**
     *  1.使用地待授权  2. 使用地已授权 3. 归属地待授权 4 归属地已授权   5.使用地待审核  6. 使用地已审核 7. 归属地待审核  8归属地已审核   99完成
     */
	private Long auth;
    /**
     *  状态 0-失效；1-正常；
     */
	private Byte state;
    /**
     *  审请原因
     */
	private String reason;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
	public Long getCreateUserId(){
        return this.createUserId;
    }
    public void setCreateUserId(Long createUserId){
        this.createUserId = createUserId;
    }
	public String getCreateUserName(){
        return this.createUserName;
    }
    public void setCreateUserName(String createUserName){
        this.createUserName = createUserName;
    }
	public String getCreateUserDept(){
        return this.createUserDept;
    }
    public void setCreateUserDept(String createUserDept){
        this.createUserDept = createUserDept;
    }
	public Long getAuthType(){
        return this.authType;
    }
    public void setAuthType(Long authType){
        this.authType = authType;
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
	public Long getAuth(){
        return this.auth;
    }
    public void setAuth(Long auth){
        this.auth = auth;
    }
	public Byte getState(){
        return this.state;
    }
    public void setState(Byte state){
        this.state = state;
    }
	public String getReason(){
        return this.reason;
    }
    public void setReason(String reason){
        this.reason = reason;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
