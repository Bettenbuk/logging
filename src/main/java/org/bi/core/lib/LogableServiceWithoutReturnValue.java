package org.bi.core.lib;

public abstract class LogableServiceWithoutReturnValue extends LogableService {

    protected abstract void doProcess();

    public void execute() {
        logger.info("Start");
        logger.debug(toString());
        doProcess();
        logger.info("End");
    }
}
