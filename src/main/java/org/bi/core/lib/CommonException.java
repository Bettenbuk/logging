package org.bi.core.lib;

import org.bi.core.logger.Logger;

import java.util.List;

public abstract class CommonException extends RuntimeException {

    public static final List<String> UNEXPECTED = List.of("UNEXPECTED");
    private static Logger logger;
    public List<String> errors;

    public static void setLogger(Logger logger) {
        CommonException.logger = logger;
    }

    public CommonException(List<String> errors, Throwable cause) {
        super(cause);
        this.errors = errors;
    }

    public CommonException(List<String> errors) {
        this.errors = errors;
    }

    public CommonException(String error, Throwable cause) {
        super(cause);
        this.errors = List.of(error);
    }

    public CommonException(String error) {
        this.errors = List.of(error);
    }
}
