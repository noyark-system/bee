package net.noyark.www.web.gulesberry.springboot.outcode.controller;

import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.DuplicatedUsernameException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.InsertException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.ServiceException;
import net.noyark.www.web.gulesberry.springboot.outcode.service.ex.UserNotFoundException;
import net.noyark.www.web.gulesberry.springboot.outcode.util.ResponseResult;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作为各个controller的基类,并提供异常解决方案
 * @author K.J MagicLu550
 * @version 0.0.1
 */
@Controller
@ResponseBody
public class BaseController {
    /**
     * 当以下效果时使用
     * <br>
     * 操作无误,
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
     * 持久层插入的业务异常,如注册失败等
     */
    public static final int INSERT_ERROR = 400;
    /**
     * 持久层查询，如用户名不存在
     */
    public static final int FIND_ERROR = 401;
    /**
     * 持久层删除异常，如用户名不存在
     */
    public static final int DEL_ERROR = 402;
    /**
     * 未知错误
     */
    public static final int OTHER_ERROR = 500;
    /**
     * 由于持久层未知错误的插入异常
     */
    public static final int DB_INSERT_SERIOUS_ERROR = 501;
    /**
     * 由于持久层未知错误的查询异常
     */
    public static final int DB_FIND_SERIOUS_ERROR = 501;
    /**
     * 由于持久层未知错误的删除异常
     */
    public static final int DB_DEL_SERIOUS_ERROR = 502;

    @ExceptionHandler({ServiceException.class,FileUploadException.class})
    public ResponseResult<Void> handleException(Exception e)
    {
        ResponseResult<Void> rr = new ResponseResult<Void>();
        rr.setMessage(e.getMessage());
        System.err.println(e.getMessage());
        if(e instanceof DuplicatedUsernameException) {
            //数据库插入异常:用户名已存在
            rr.setState(INSERT_ERROR);
        }else if (e instanceof UserNotFoundException){
           /*
            * 数据库查询异常:查询不到用户
            */
            rr.setState(FIND_ERROR);
        }else if(e instanceof InsertException){
            /*
             * 数据库插入异常:未知错误
             */
            rr.setState(DB_INSERT_SERIOUS_ERROR);
        }
        return rr;
    }
}
