package com.cy.store.service.ex;

/**
 * 用户名被占用的异常
 */
public class UsernameDuplicatedExcption extends ServiceException{
    public UsernameDuplicatedExcption() {
        super();
    }

    public UsernameDuplicatedExcption(String message) {
        super(message);
    }

    public UsernameDuplicatedExcption(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameDuplicatedExcption(Throwable cause) {
        super(cause);
    }

    protected UsernameDuplicatedExcption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
