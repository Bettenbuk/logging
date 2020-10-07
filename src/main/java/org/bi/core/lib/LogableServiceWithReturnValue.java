package org.bi.core.lib;

public abstract class LogableServiceWithReturnValue <T> extends LogableService {

    protected abstract T doProcess();

    public T execute() {
        logger.info("Start");
        logger.debug(toString());
        T result = doProcess();
        logger.debug(result.toString());
        logger.info("End");
        return result;
    }
}
