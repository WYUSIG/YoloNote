package com.cjw.yolonote.config;

/**
 * 运行时自定义异常
 */
public class MyThrowException extends RuntimeException {


    public MyThrowException(String message) {
        super(message);
    }

    public MyThrowException(String message, Throwable cause) {
        super(message, cause);
    }

}
