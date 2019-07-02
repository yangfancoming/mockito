

package org.mockito.exceptions.misusing;

import org.mockito.exceptions.base.MockitoException;

public class UnfinishedStubbingException extends MockitoException {

    private static final long serialVersionUID = 1L;

    public UnfinishedStubbingException(String message) {
        super(message);
    }
}
