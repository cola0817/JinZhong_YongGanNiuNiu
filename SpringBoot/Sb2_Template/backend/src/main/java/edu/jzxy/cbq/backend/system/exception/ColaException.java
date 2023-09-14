package edu.jzxy.cbq.backend.system.exception;


import edu.jzxy.cbq.backend.system.enums.ErrorCode;

/**
 * @author Cola0817
 * @date 2023/9/8 15:36
 * @since 1.0
 */
public class ColaException extends RuntimeException{
    private int code = 500;

    public ColaException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public ColaException() {
    }

    public ColaException(String message) {
        super(message);
    }

    public ColaException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColaException(Throwable cause) {
        super(cause);
    }

    public ColaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public int getCode() {
        return code;
    }
}
