

package org.mockito.exceptions.verification;

import org.mockito.exceptions.base.MockitoAssertionError;

/**
 * No interactions wanted. See exception's cause for location of undesired invocation.
 */
public class NoInteractionsWanted extends MockitoAssertionError {

    private static final long serialVersionUID = 1L;

    public NoInteractionsWanted(String message) {
        super(message);
    }
}
