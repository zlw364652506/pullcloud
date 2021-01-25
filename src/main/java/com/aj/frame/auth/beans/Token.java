package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  票据
 * @Description:票据
 * @author: chenzhirong
 * @date:2020-09-28 02:25:37
 * @version V1.0
 */
public class Token extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  票据id，128bit，32个16进制字符串表示，每个平台内部唯一
     */
	private String tokenId;
    /**
     *  发行者 Id，平台隶属组织机构代码 GA380，12 位
     */
	private String orgId;
    /**
     *  扩展项，可空
     */
	private String exten;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public String getTokenId(){
        return this.tokenId;
    }
    public void setTokenId(String tokenId){
        this.tokenId = tokenId;
    }
	public String getOrgId(){
        return this.orgId;
    }
    public void setOrgId(String orgId){
        this.orgId = orgId;
    }
	public String getExten(){
        return this.exten;
    }
    public void setExten(String exten){
        this.exten = exten;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
