package net.noyark.www.web.gulesberry.springboot.outcode.service.ex;

/**
 * 当插入失败时，抛出该异常
 *情景: 注册
 * @author Kevin J.
 * @author Magiclu550
 *
 */
public class InsertException extends ServiceException{
    public InsertException() {
    }

    public InsertException(String message) {
        super(message);
    }

    public InsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsertException(Throwable cause) {
        super(cause);
    }

    public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
