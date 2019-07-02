

package org.mockito.exceptions.misusing;

import org.mockito.exceptions.base.MockitoException;

public class NotAMockException extends MockitoException {

    private static final long serialVersionUID = 1L;

    public NotAMockException(String message) {
        super(message);
    }
}
