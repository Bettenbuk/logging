package org.bi.core.lib;

import org.bi.core.logger.Logger;

public abstract class LogableException extends RuntimeException {

    protected static Logger logger;

    public static void setLogger(Logger logger) {
        LogableException.logger = logger;
    }

    public LogableException() {
    }

    public LogableException(Throwable cause) {
        super(cause);
    }
}
