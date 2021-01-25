package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  用户使用应用
 * @Description:用户使用应用
 * @author: chenzhirong
 * @date:2020-09-28 02:25:37
 * @version V1.0
 */
public class UserAppRel extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long iAppInfoObjId;
    /**
     *   对象主键id
     */
    private Long iUserInfoObjId;



    public Long getiAppInfoObjId(){
        return this.iAppInfoObjId;
    }
    public void setiAppInfoObjId(Long iAppInfoObjId){
        this.iAppInfoObjId = iAppInfoObjId;
    }

    public Long getiUserInfoObjId(){
        return this.iUserInfoObjId;
    }
    public void setiUserInfoObjId(Long iUserInfoObjId){
        this.iUserInfoObjId = iUserInfoObjId;
    }


    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" };
    }
}
