

package org.mockito.exceptions.verification;

import org.mockito.exceptions.base.MockitoAssertionError;

/**
 * @deprecated as of 2.27.5. Please use {@link TooFewActualInvocations} instead.
 * @see TooFewActualInvocations
 */
@Deprecated
public class TooLittleActualInvocations extends MockitoAssertionError {

    private static final long serialVersionUID = 1L;

    public TooLittleActualInvocations(String message) {
        super(message);
    }
}
