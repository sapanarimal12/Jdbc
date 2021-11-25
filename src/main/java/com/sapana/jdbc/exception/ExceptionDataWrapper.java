package com.sapana.jdbc.exception;

import com.sapana.jdbc.response.Response;


@FunctionalInterface
    public interface ExceptionDataWrapper {
        Response handle() throws Exception;
    }

