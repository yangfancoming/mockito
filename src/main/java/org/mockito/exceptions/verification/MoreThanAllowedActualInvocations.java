

package org.mockito.exceptions.verification;

import org.mockito.exceptions.base.MockitoAssertionError;

/**
 * Thrown when atMost(x) verification fails. See {@link org.mockito.Mockito#atMost(int)}.
 *
 * @since 2.20.5
 */
public class MoreThanAllowedActualInvocations extends MockitoAssertionError {

    public MoreThanAllowedActualInvocations(String message) {
        super(message);
    }
}
