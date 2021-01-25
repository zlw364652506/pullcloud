package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  头
 * @Description:头
 * @author: chenzhirong
 * @date:2020-09-28 02:25:35
 * @version V1.0
 */
public class Head extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  对象主键id
     */
	private Long iTokenObjId;
    /**
     *  对象主键id
     */
	private Long iDurationObjId;
    /**
     *  凭证格式版本（两节点分
     */
	private String version;
    /**
     *  凭证类型(1.用户,2.应 用,3.资源)
     */
	private String credType;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getiTokenObjId(){
        return this.iTokenObjId;
    }
    public void setiTokenObjId(Long iTokenObjId){
        this.iTokenObjId = iTokenObjId;
    }
	public Long getiDurationObjId(){
        return this.iDurationObjId;
    }
    public void setiDurationObjId(Long iDurationObjId){
        this.iDurationObjId = iDurationObjId;
    }
	public String getVersion(){
        return this.version;
    }
    public void setVersion(String version){
        this.version = version;
    }
	public String getCredType(){
        return this.credType;
    }
    public void setCredType(String credType){
        this.credType = credType;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
