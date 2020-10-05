package org.bi.core;

import org.bi.core.lib.InteractorService;
import org.bi.core.logger.Logger;

public class Something implements SomethingInteractor{

    public Something(Presenter presenter, Logger logger) {
        InteractorService.setPresenter(presenter);
        InteractorService.setLogger(logger);

    }

    @Override
    public void doSomething(String s) {
        new DoSomethingService(s).execute();
    }
}
