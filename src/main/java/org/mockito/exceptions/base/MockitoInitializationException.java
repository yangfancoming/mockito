

package org.mockito.exceptions.base;

public class MockitoInitializationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MockitoInitializationException(String message) {
        super(message);
    }

    public MockitoInitializationException(String message, Throwable cause) {
        super(message, cause);
    }
}
