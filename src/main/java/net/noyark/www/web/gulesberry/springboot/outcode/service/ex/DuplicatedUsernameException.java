package net.noyark.www.web.gulesberry.springboot.outcode.service.ex;

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
