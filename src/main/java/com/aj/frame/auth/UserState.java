package com.aj.frame.auth;

/**
 * 用户状态
 * 
 */
public class UserState {

	/**
	 * 已注销（逻辑删除）
	 */
	public final static byte Removed = 0;

	/**
	 * 已禁用
	 */
	public final static byte Forbidden = 1;

	/**
	 * 审核通过
	 */
	public final static byte Approved = 2;

	/**
	 * 审核不通过
	 */
	public final static byte NotApproved = 3;

	/**
	 * 待审核
	 */
	public final static byte WaitCheck = 4;

}
