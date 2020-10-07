package org.bi.core.lib;

import org.bi.core.logger.Logger;

public abstract class LogableService {

    public static void setLogger(Logger logger) {
        LogableService.logger = logger;
        LogableException.setLogger(logger);
    }

    protected static Logger logger;

}
