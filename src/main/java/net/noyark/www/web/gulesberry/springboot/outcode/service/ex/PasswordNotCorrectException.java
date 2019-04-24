package net.noyark.www.web.gulesberry.springboot.outcode.service.ex;

/**
 * 当在注册和登录操作时，密码错误，则会抛出该异常
 *
 * 情景:登录，修改密码
 *
 * @author Kevin J
 * @author Magiclu550
 */
public class PasswordNotCorrectException extends ServiceException{
    public PasswordNotCorrectException() {
    }

    public PasswordNotCorrectException(String message) {
        super(message);
    }

    public PasswordNotCorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNotCorrectException(Throwable cause) {
        super(cause);
    }

    public PasswordNotCorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
