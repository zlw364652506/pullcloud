package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  申请表详情
 * @Description:申请表详情
 * @author: chenzhirong
 * @date:2020-09-28 02:25:37
 * @version V1.0
 */
public class TableDetails extends AJFrameNamedBeanAbstract {

    /**
     *   主键
     */
    private Long objId;

    /**
     *  主键
     */
	private Long iTableObjId;
    /**
     *  申请表ID
     */
	private Long tableId;
    /**
     *  主键A
     */
	private String relIdA;
    /**
     *  主键A类型：1 用户  2 应用  3 资源  4 设备  5 机构
     */
	private Long idAType;
    /**
     *  主键B
     */
	private String relIdB;
    /**
     *  主键B类型 ： 1 用户  2 应用  3 资源  4 设备  5 机构
     */
	private Long idBType;
    /**
     *  申请表类型: 1用户对应用授权  2应用对资源授权  3用户对机构授权  4设备对机构授权  5资源对机构授权  6应用对机构授权  7 新增  8 修改  9 删除
     */
	private Long tableType;
    /**
     *  创建时间
     */
	private Date createTime;
    /**
     *  更新时间
     */
	private Date updateTime;
    /**
     *  状态 0-失效；1-正常；
     */
	private Byte state;


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
	public Long getTableId(){
        return this.tableId;
    }
    public void setTableId(Long tableId){
        this.tableId = tableId;
    }
	public String getRelIdA(){
        return this.relIdA;
    }
    public void setRelIdA(String relIdA){
        this.relIdA = relIdA;
    }
	public Long getIdAType(){
        return this.idAType;
    }
    public void setIdAType(Long idAType){
        this.idAType = idAType;
    }
	public String getRelIdB(){
        return this.relIdB;
    }
    public void setRelIdB(String relIdB){
        this.relIdB = relIdB;
    }
	public Long getIdBType(){
        return this.idBType;
    }
    public void setIdBType(Long idBType){
        this.idBType = idBType;
    }
	public Long getTableType(){
        return this.tableType;
    }
    public void setTableType(Long tableType){
        this.tableType = tableType;
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
	public Byte getState(){
        return this.state;
    }
    public void setState(Byte state){
        this.state = state;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
