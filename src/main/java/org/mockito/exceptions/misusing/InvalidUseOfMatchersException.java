

package org.mockito.exceptions.misusing;

import org.mockito.exceptions.base.MockitoException;

public class InvalidUseOfMatchersException extends MockitoException {

    private static final long serialVersionUID = 1L;

    public InvalidUseOfMatchersException(String message) {
        super(message);
    }

    public InvalidUseOfMatchersException() {
        super("");
    }
}
