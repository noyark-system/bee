package net.noyark.www.web.gulesberry.springboot.outcode.util;

import java.io.Serializable;

/**
 * 本类是返回给ajax处理的响应类，用于返回对应的信息和状态码，
 * 交付给jquery进行处理，实现前端与后端的交互，这里规定了4个
 * 抽象方法，开发者根据具体需求进行使用，一般用于在控制器类，
 * 处理抛出异常等操作。当没有data时，建议使用Void类。
 * <br>
 * <code>
 * 	return new ResponseResult[Void]
 * </code>
 * @author magiclu550 K.J
 *
 * @param <T> data信息流的占位符，如果无，使用Void
 */

public class ResponseResult<T> implements Serializable
{
	private static final long serialVersionUID = -6586552506064322941L;
	/**
	 * 响应状态码,使用以下常量
	 */
	private int state;
	/**
	 * 对应的信息，一般用于异常抛出的行为，捕捉异常信息
	 * 给予前端使用
	 */
	private String message;
	/**
	 * 对应返回的信息流
	 */
	private T data;

	/**
	 * 空构造器,主要用于BaseController
	 * @see net.noyark.www.web.gulesberry.springboot.outcode.controller.BaseController
	 */
	public ResponseResult() {
	}

	/**
	 * 使用在仅仅返回状态码而不返回信息的问题
	 * 以下类推
	 * @param state 信息响应状态码
	 */
	public ResponseResult(int state) {
		this.state = state;
	}
	public ResponseResult(int state,String message) {
		this(state);
		this.message = message;
	}
	public ResponseResult(int state,String message,T data) {
		this(state,message);
		this.data = data;
	}
	public ResponseResult(int state,T data) {
		this(state,null,data);
	}

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}
