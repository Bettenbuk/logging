package org.bi.starter;

import org.bi.core.Presenter;
import org.bi.core.logger.Logger;

import java.util.List;

public class PresenterImpl implements Presenter {

    private final Logger logger;

    public PresenterImpl(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void deliverString(String s) {
        logger.info("PresenterImpl.deliverString:" + s);
        System.out.println("PresenterImpl.deliverString:" + s);
    }

    @Override
    public void deliverErrors(List<String> errors) {
        System.out.println("PresenterImpl.deliverErrors:" + errors);
        logger.info("PresenterImpl.deliverErrors:" + errors);
    }
}
