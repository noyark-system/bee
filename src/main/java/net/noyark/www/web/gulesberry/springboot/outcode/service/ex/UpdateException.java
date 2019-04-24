package net.noyark.www.web.gulesberry.springboot.outcode.service.ex;

/**
 * 当密码更新出错时，抛出该异常
 *
 * 情景:修改密码，修改头像，修改其他信息
 *
 * @author Kevin J
 * @author Magiclu550
 *
 */
public class UpdateException extends ServiceException {
    public UpdateException() {
    }

    public UpdateException(String message) {
        super(message);
    }

    public UpdateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateException(Throwable cause) {
        super(cause);
    }

    public UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
