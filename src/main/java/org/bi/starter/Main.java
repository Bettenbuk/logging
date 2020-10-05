package org.bi.starter;

import org.bi.core.Presenter;
import org.bi.core.Something;
import org.bi.core.SomethingInteractor;
import org.bi.core.logger.LogLevel;
import org.bi.core.logger.Logger;

public class Main {

    public static void main(String[] args){
        Logger logger = new Logger();
        Presenter presenter = new PresenterImpl(logger);
        SomethingInteractor interactor = new Something(presenter, logger);
        Logger.setLogLevel(LogLevel.ERROR);
        interactor.doSomething("world");
        interactor.doSomething("commonException");
        interactor.doSomething("unexpectedException");
    }
}
