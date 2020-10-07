package org.bi.gateway;

import org.bi.core.lib.LogableServiceWithReturnValue;

public class DoSomethingElse extends LogableServiceWithReturnValue<String> {
    private String parameter;

    public DoSomethingElse setParameters(String parameter) {
        this.parameter = parameter;
        return this;
    }

    @Override
    protected String doProcess() {
        return "Hello " + parameter + "!";
    }
}
