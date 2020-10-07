package org.bi.core;

import org.bi.core.lib.InteractorService;
import org.bi.core.lib.LogableService;
import org.bi.core.logger.Logger;

public class Something implements SomethingInteractor{

    private final DoSomethingService doSomethingService;

    public Something(Presenter presenter, Logger logger, OtherThingGateway otherThingGateway) {
        InteractorService.setPresenter(presenter);
        LogableService.setLogger(logger);
        doSomethingService = new DoSomethingService(otherThingGateway);
    }

    @Override
    public void doSomething(String s) {
        doSomethingService.setParameters(s).execute();
    }
}
