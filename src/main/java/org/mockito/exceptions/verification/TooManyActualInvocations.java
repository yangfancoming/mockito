

package org.mockito.exceptions.verification;

import org.mockito.exceptions.base.MockitoAssertionError;

public class TooManyActualInvocations extends MockitoAssertionError {

    private static final long serialVersionUID = 1L;

    public TooManyActualInvocations(String message) {
        super(message);
    }
}
