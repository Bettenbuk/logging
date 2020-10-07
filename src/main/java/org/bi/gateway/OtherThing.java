package org.bi.gateway;

import org.bi.core.OtherThingGateway;

public class OtherThing implements OtherThingGateway {

    private final DoSomethingElse doSomethingElse;

    public OtherThing() {
        doSomethingElse = new DoSomethingElse();
    }

    @Override
    public String doSomethingElse(String s) {
        return doSomethingElse.setParameters(s).execute();
    }
}
