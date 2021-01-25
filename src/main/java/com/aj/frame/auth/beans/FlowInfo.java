package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  流程单据
 * @Description:流程单据
 * @author: chenzhirong
 * @date:2020-09-28 02:25:34
 * @version V1.0
 */
public class FlowInfo extends AJFrameNamedBeanAbstract {

    /**
     *   流程ID
     */
    private Long objId;

    /**
     *  主键
     */
	private Long iTableObjId;
    /**
     *  上一流程主键
     */
	private Long flowId;
    /**
     *  授权人
     */
	private String authUserId;
    /**
     *  授权人姓名
     */
	private String authUserName;
    /**
     *  授权人部门代码
     */
	private Long suthDeptCode;
    /**
     *  意见
     */
	private String opinion;
    /**
     *  下一流程审核人
     */
	private Long nextUserId;
    /**
     *  1 通过  2 不通过
     */
	private Long flowState;
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

	public Long getiTableObjId(){
        return this.iTableObjId;
    }
    public void setiTableObjId(Long iTableObjId){
        this.iTableObjId = iTableObjId;
    }
	public Long getFlowId(){
        return this.flowId;
    }
    public void setFlowId(Long flowId){
        this.flowId = flowId;
    }
	public String getAuthUserId(){
        return this.authUserId;
    }
    public void setAuthUserId(String authUserId){
        this.authUserId = authUserId;
    }
	public String getAuthUserName(){
        return this.authUserName;
    }
    public void setAuthUserName(String authUserName){
        this.authUserName = authUserName;
    }
	public Long getSuthDeptCode(){
        return this.suthDeptCode;
    }
    public void setSuthDeptCode(Long suthDeptCode){
        this.suthDeptCode = suthDeptCode;
    }
	public String getOpinion(){
        return this.opinion;
    }
    public void setOpinion(String opinion){
        this.opinion = opinion;
    }
	public Long getNextUserId(){
        return this.nextUserId;
    }
    public void setNextUserId(Long nextUserId){
        this.nextUserId = nextUserId;
    }
	public Long getFlowState(){
        return this.flowState;
    }
    public void setFlowState(Long flowState){
        this.flowState = flowState;
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
