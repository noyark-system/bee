package net.noyark.www.web.gulesberry.springboot.outcode.service.ex;

/**
 * 当出现拒绝访问的时候，则抛出该异常
 *
 * 情景:通过uid获取用户信息的时候
 *
 * @author Kevin J
 * @author Magiclu550
 */
public class AccessDeniedException extends ServiceException {
    public AccessDeniedException() {
    }

    public AccessDeniedException(String message) {
        super(message);
    }

    public AccessDeniedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessDeniedException(Throwable cause) {
        super(cause);
    }

    public AccessDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
