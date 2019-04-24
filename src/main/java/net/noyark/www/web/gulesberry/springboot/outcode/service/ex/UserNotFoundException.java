package net.noyark.www.web.gulesberry.springboot.outcode.service.ex;

/**
 * 当找不到用户的时候，抛出该异常
 *
 * 登录，修改密码，修改其他信息，修改头像，通过uid获取用户信息
 *
 * @author Kevin J
 * @author Magiclu550
 *
 */
public class UserNotFoundException extends ServiceException{
    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }

    public UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
