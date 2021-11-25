package com.sapana.jdbc.exception;

import com.sapana.jdbc.util.LogUtil;

public class Ex {

    public static void caught(ExceptionWrapper wrapper) {
        try {
            wrapper.handle();
        } catch (Exception ex) {
            LogUtil.exception(ex);
        }
    }
}
