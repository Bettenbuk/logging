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
        run(LogLevel.DEBUG, interactor);
        run(LogLevel.INFO, interactor);
        run(LogLevel.ERROR, interactor);
    }

    private static void run(LogLevel logLevel, SomethingInteractor interactor) {
        Logger.setLogLevel(logLevel);
        System.out.println("*********"+ logLevel + "*********");
        interactor.doSomething("world");
        System.out.println("------------------------");
        interactor.doSomething("inputException");
        System.out.println("------------------------");
        interactor.doSomething("handledException");
        System.out.println("------------------------");
        interactor.doSomething("unexpectedException");
    }
}
