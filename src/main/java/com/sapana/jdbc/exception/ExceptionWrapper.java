package com.sapana.jdbc.exception;

@FunctionalInterface
public interface ExceptionWrapper {
    void  handle() throws Exception;

}
