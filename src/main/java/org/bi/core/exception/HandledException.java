package org.bi.core.exception;

import org.bi.core.lib.CommonException;

public class HandledException extends CommonException {
    public HandledException(Throwable e) {
        super("Handled Exception", e);
    }
}
