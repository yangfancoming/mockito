

package org.mockito;

import org.mockito.listeners.MockitoListener;

import static org.mockito.internal.progress.ThreadSafeMockingProgress.mockingProgress;

public class StateMaster {

    public void reset() {
        mockingProgress().reset();
        mockingProgress().resetOngoingStubbing();
    }

    public void validate() {
        mockingProgress().validateState();
    }

    /**
     * Clears Mockito listeners added by {@link MockitoFramework#addListener(MockitoListener)}
     */
    public void clearMockitoListeners() {
        mockingProgress().clearListeners();
    }
}
