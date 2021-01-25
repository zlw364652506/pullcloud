package com.aj.frame.auth.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**
 * @Title:  Mysql序列，用来模拟oracle序列机制的表
 * @Description:Mysql序列，用来模拟oracle序列机制的表
 * @author: chenzhirong
 * @date:2020-09-28 02:25:35
 * @version V1.0
 */
public class MysqlSequences extends AJFrameNamedBeanAbstract {

    /**
     *   序列名称，主键
     */
    private String seqName;

    /**
     *  序列的说明
     */
	private String seqComment;
    /**
     *  序列的当前值
     */
	private Long currentValue;
    /**
     *  序列起始值
     */
	private Long startValue;
    /**
     *  序列最大值
     */
	private Long maxValue;
    /**
     *  序列最小值
     */
	private Long minValue;
    /**
     *  序列Cache数量
     */
	private Long cacheNum;


    public String getSeqName(){
        return this.seqName;
    }
    public void setSeqName(String seqName){
        this.seqName = seqName;
    }

	public String getSeqComment(){
        return this.seqComment;
    }
    public void setSeqComment(String seqComment){
        this.seqComment = seqComment;
    }
	public Long getCurrentValue(){
        return this.currentValue;
    }
    public void setCurrentValue(Long currentValue){
        this.currentValue = currentValue;
    }
	public Long getStartValue(){
        return this.startValue;
    }
    public void setStartValue(Long startValue){
        this.startValue = startValue;
    }
	public Long getMaxValue(){
        return this.maxValue;
    }
    public void setMaxValue(Long maxValue){
        this.maxValue = maxValue;
    }
	public Long getMinValue(){
        return this.minValue;
    }
    public void setMinValue(Long minValue){
        this.minValue = minValue;
    }
	public Long getCacheNum(){
        return this.cacheNum;
    }
    public void setCacheNum(Long cacheNum){
        this.cacheNum = cacheNum;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" };
    }
}
