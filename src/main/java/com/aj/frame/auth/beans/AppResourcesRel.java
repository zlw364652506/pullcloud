package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  资源属于应用
 * @Description:资源属于应用
 * @author: chenzhirong
 * @date:2020-09-28 02:25:33
 * @version V1.0
 */
public class AppResourcesRel extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long iAppInfoObjId;
    /**
     *   对象主键id
     */
    private Long iResoursecObjId;



    public Long getiAppInfoObjId(){
        return this.iAppInfoObjId;
    }
    public void setiAppInfoObjId(Long iAppInfoObjId){
        this.iAppInfoObjId = iAppInfoObjId;
    }

    public Long getiResoursecObjId(){
        return this.iResoursecObjId;
    }
    public void setiResoursecObjId(Long iResoursecObjId){
        this.iResoursecObjId = iResoursecObjId;
    }


    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" };
    }
}
