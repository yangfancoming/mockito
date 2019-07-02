

package org.mockito.exceptions.misusing;

import org.mockito.exceptions.base.MockitoException;

public class MissingMethodInvocationException extends MockitoException {

    private static final long serialVersionUID = 1L;

    public MissingMethodInvocationException(String message) {
        super(message);
    }
}
