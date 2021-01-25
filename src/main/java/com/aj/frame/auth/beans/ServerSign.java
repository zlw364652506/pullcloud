package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  认证对象的服务端签名
 * @Description:认证对象的服务端签名
 * @author: chenzhirong
 * @date:2020-09-28 02:25:36
 * @version V1.0
 */
public class ServerSign extends AJFrameNamedBeanAbstract {

    /**
     *   对象主键id
     */
    private Long objId;

    /**
     *  签名算法 比如  [SM3+SM2] 等等
     */
	private String alg;
    /**
     *  签名值（对前两部分内容head、load去除空格、回车、换行、制表符等特殊字符按字节连接合并摘要后签名）
     */
	private String signature;
    /**
     *  签名证书序列号
     */
	private String sn;
    /**
     *  验证服务器地址
     */
	private String url;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
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
	public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}
