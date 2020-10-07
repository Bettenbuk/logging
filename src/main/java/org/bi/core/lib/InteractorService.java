package org.bi.core.lib;

import java.util.List;

public abstract class InteractorService extends LogableServiceWithoutReturnValue {

    public static void setPresenter(InteractorPresenter presenter) {
        InteractorService.presenter = presenter;
    }
    protected static InteractorPresenter presenter;

    public void execute() {
        try {
            super.execute();
        } catch (CommonException e) {
            presenter.deliverErrors(e.errors);
        } catch (Exception e) {
            logger.error(CommonException.UNEXPECTED, e);
            presenter.deliverErrors(List.of(CommonException.UNEXPECTED));
        }
    }
}
