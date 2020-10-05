package org.bi.core;

import org.bi.core.exception.AnException;
import org.bi.core.lib.InteractorService;

public class DoSomethingService extends InteractorService {
    private final String parameter;

    protected DoSomethingService(String parameter) {
        this.parameter = parameter;
    }

    @Override
    protected void doProcess() {
        if ("world".equals(parameter)) {
            System.out.println("DoSomethingService.doProcess");
            ((Presenter) presenter).deliverString("Hello " + parameter + "!");
        } else if ("commonException".equals(parameter)) {
            throw new AnException();
        } else {
            int i = 1/0;
        }
    }

    @Override
    public String toString() {
        return "Parameter:" + parameter;
    }
}
