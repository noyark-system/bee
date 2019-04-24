package net.noyark.www.web.gulesberry.springboot.outcode.util;

/**
 * 本类是返回给ajax处理的响应类，用于返回对应的信息和状态码，
 * 交付给jquery进行处理，实现前端与后端的交互，这里规定了4个
 * 抽象方法，开发者根据具体需求进行使用，一般用于在控制器类，
 * 处理抛出异常等操作。当没有data时，建议使用Void类。
 * <br>
 * <code>
 * 	return new ResponseResult[Void]
 * </code>
 * @author magiclu550
 *
 * @param <T> data信息流的占位符，如果无，使用Void
 */

public class ResponseResult<T> {
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
	 * 当以下效果时使用
	 * <br>
	 * 操作无误，
	 * <br>
	 * 修改成功,
	 * <br>
	 * 查询成功
	 * <br>
	 * 匹配无误
	 * 等操作
	 */
	public static final int SUCCESS = 200;
	/**
	 * 持久层插入的业务失败,如注册失败等
	 */
	public static final int INSERT_ERROR = 400;
	/**
	 * 持久层查询失败，如用户名不存在
	 */
	public static final int FIND_ERROR = 401;
	/**
	 * 持久层删除失败，如用户名不存在
	 */
	public static final int DEL_ERROR = 402;
	/**
	 * 未知错误
	 */
	public static final int OTHER_ERROR = 500;
	/**
	 * 由于持久层未知错误的插入失败
	 */
	public static final int DB_INSERT_SERIOUS_ERROR = 501;
	/**
	 * 由于持久层未知错误的查询失败
	 */
	public static final int DB_FIND_SERIOUS_ERROR = 501;
	/**
	 * 由于持久层未知错误的删除失败
	 */
	public static final int DB_DEL_SERIOUS_ERROR = 502;
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
