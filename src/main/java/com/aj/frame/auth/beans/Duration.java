package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  凭证生存期限
 * @Description:凭证生存期限
 * @author: chenzhirong
 * @date:2020-09-28 02:25:34
 * @version V1.0
 */
public class Duration extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  开始生效时间 生效时间(时间戳，数字字符串)
     */
	private Date startTime;
    /**
     *  结束生效时间 生效时间(时间戳，数字字符串)
     */
	private Date endTime;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Date getStartTime(){
        return this.startTime;
    }
    public void setStartTime(Date startTime){
        this.startTime = startTime;
    }
	public Date getEndTime(){
        return this.endTime;
    }
    public void setEndTime(Date endTime){
        this.endTime = endTime;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
