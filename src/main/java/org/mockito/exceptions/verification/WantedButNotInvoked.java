

package org.mockito.exceptions.verification;

import static org.mockito.internal.util.StringUtil.removeFirstLine;

import org.mockito.exceptions.base.MockitoAssertionError;

public class WantedButNotInvoked extends MockitoAssertionError {

    private static final long serialVersionUID = 1L;

    public WantedButNotInvoked(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return removeFirstLine(super.toString());
    }
}
