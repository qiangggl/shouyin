package com.zhonghuilv.shouyin.exception;

/**
 * Create By zhengjing on 2018/4/8 10:06
 */
public class ServiceNotSupport extends CustomRuntimeException {

    private static final Long ERRCODE_MIN = 3000_000L;

    public ServiceNotSupport(Long errcode, String message) {
        super(ERRCODE_MIN + errcode, message);
    }

    public ServiceNotSupport(String message) {
        super(ERRCODE_MIN, message);
    }
}
