package org.bi.core.lib;

import org.bi.core.logger.Logger;

import java.util.List;

public abstract class InteractorService {

    public static void setLogger(Logger logger) {
        InteractorService.logger = logger;
        CommonException.setLogger(logger);
    }

    public static void setPresenter(InteractorPresenter presenter) {
        InteractorService.presenter = presenter;
    }

    protected static Logger logger;
    protected static InteractorPresenter presenter;

    protected abstract void doProcess();

    public abstract String toString();

    public void execute() {
        logger.info("Start");
        logger.debug(toString());
        try {
            doProcess();
        } catch (CommonException e) {
            presenter.deliverErrors(e.errors);
        } catch (Exception e) {
            logger.error(CommonException.UNEXPECTED, e);
            presenter.deliverErrors(List.of(CommonException.UNEXPECTED));
        }
        logger.info("End");
    }
}
