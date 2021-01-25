package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**
 * @Title:  认证对象（客户端）签名
 * @Description:认证对象（客户端）签名
 * @author: chenzhirong
 * @date:2020-09-28 02:25:34
 * @version V1.0
 */
public class ClientSign extends AJFrameNamedBeanAbstract {

    /**
     *   
     */
    private Long objId;

    /**
     *  对象主键id
     */
	private Long iCredentialObjId;
    /**
     *  签名算法[SM3+SM2]
     */
	private String alg;
    /**
     *  签名值（在收到服务端返回凭证后对前两部分内容head、load按字节连接摘要后签名）
     */
	private String signature;
    /**
     *  签名证书序列号
     */
	private String sn;
    /**
     *  创建时间
     */
	private Date createtTime;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getiCredentialObjId(){
        return this.iCredentialObjId;
    }
    public void setiCredentialObjId(Long iCredentialObjId){
        this.iCredentialObjId = iCredentialObjId;
    }
	public String getAlg(){
        return this.alg;
    }
    public void setAlg(String alg){
        this.alg = alg;
    }
	public String getSignature(){
        return this.signature;
    }
    public void setSignature(String signature){
        this.signature = signature;
    }
	public String getSn(){
        return this.sn;
    }
    public void setSn(String sn){
        this.sn = sn;
    }
	public Date getCreatetTime(){
        return this.createtTime;
    }
    public void setCreatetTime(Date createtTime){
        this.createtTime = createtTime;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
