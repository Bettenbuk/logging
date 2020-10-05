package org.bi.core;

import org.bi.core.exception.HandledException;
import org.bi.core.exception.InputException;
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
            logger.debug("DoSomethingService.doProcess");
            ((Presenter) presenter).deliverString("Hello " + parameter + "!");
        } else if ("inputException".equals(parameter)) {
            throw new InputException();
        } else if ("handledException".equals(parameter)) {
            try {
                int i = 1 / 0;
            } catch (Exception e) {
                throw new HandledException(e);
            }
        } else {
            int i = 1 / 0;
        }
    }

    @Override
    public String toString() {
        return "Parameter:" + parameter;
    }
}
