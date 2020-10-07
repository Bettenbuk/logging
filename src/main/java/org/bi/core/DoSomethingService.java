package org.bi.core;

import org.bi.core.exception.HandledException;
import org.bi.core.exception.InputException;
import org.bi.core.lib.InteractorService;
import org.bi.core.lib.LogableServiceWithoutReturnValue;

public class DoSomethingService extends InteractorService {
    private final OtherThingGateway otherThingGateway;
    private String parameter;

    public DoSomethingService(OtherThingGateway otherThingGateway) {
        this.otherThingGateway = otherThingGateway;
    }

    public DoSomethingService setParameters(String parameter) {
        this.parameter = parameter;
        return this;
    }

    @Override
    protected void doProcess() {
        if ("world".equals(parameter)) {
            System.out.println("DoSomethingService.doProcess");
            logger.debug("DoSomethingService.doProcess");
            ((Presenter) presenter).deliverString(otherThingGateway.doSomethingElse(parameter));
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
