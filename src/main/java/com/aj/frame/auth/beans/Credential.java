package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  身份凭证文件格式
 * @Description:身份凭证文件格式
 * @author: chenzhirong
 * @date:2020-09-28 02:25:34
 * @version V1.0
 */
public class Credential extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  对象主键id
     */
	private Long iServerSignObjId;
    /**
     *  对象主键id
     */
	private Long iHeadObjId;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getiServerSignObjId(){
        return this.iServerSignObjId;
    }
    public void setiServerSignObjId(Long iServerSignObjId){
        this.iServerSignObjId = iServerSignObjId;
    }
	public Long getiHeadObjId(){
        return this.iHeadObjId;
    }
    public void setiHeadObjId(Long iHeadObjId){
        this.iHeadObjId = iHeadObjId;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
