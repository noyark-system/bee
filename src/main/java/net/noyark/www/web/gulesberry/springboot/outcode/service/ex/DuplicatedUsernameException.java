package net.noyark.www.web.gulesberry.springboot.outcode.service.ex;

/**
 * 用户名重复时，抛出该异常，在控制器层读取
 *
 * 情景:注册
 * @author Kevin J.
 * @author Magiclu550
 */
public class DuplicatedUsernameException extends ServiceException {
    public DuplicatedUsernameException() {
    }

    public DuplicatedUsernameException(String message) {
        super(message);
    }

    public DuplicatedUsernameException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicatedUsernameException(Throwable cause) {
        super(cause);
    }

    public DuplicatedUsernameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
