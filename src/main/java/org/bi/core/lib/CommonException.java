package org.bi.core.lib;

import org.bi.core.logger.Logger;

import java.util.List;

public abstract class CommonException extends LogableException {

    public static final String UNEXPECTED = "UNEXPECTED";
    public List<String> errors;

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
