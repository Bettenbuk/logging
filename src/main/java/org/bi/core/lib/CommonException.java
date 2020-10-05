package org.bi.core.lib;

import org.bi.core.logger.Logger;

import java.util.List;

public abstract class CommonException extends RuntimeException {

    public static final String UNEXPECTED = "UNEXPECTED";
    private static Logger logger;
    public List<String> errors;

    public static void setLogger(Logger logger) {
        CommonException.logger = logger;
    }

    public CommonException(String error, Throwable cause) {
        this(List.of(error), cause);
    }

    public CommonException(List<String> errors, Throwable cause) {
        super(cause);
        this.errors = errors;
        logger.error(errors.toString(), cause);
    }

    public CommonException(String error) {
        this(List.of(error));
    }

    public CommonException(List<String> errors) {
        this.errors = errors;
        logger.error(errors.toString());
    }
}
