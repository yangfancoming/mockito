

package org.mockito.exceptions.verification;

import org.mockito.exceptions.base.MockitoAssertionError;

public class VerificationInOrderFailure extends MockitoAssertionError {

    private static final long serialVersionUID = 1L;

    public VerificationInOrderFailure(String message) {
        super(message);
    }
}
