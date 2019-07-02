
package org.mockito.internal.runners.util;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * Implementation of JUnit run listener that knows when any of the tests failed
 */
public class FailureDetector extends RunListener {

    private boolean failed;

    @Override
    public void testFailure(Failure failure) throws Exception {
        super.testFailure(failure);
        failed = true;
    }

    public boolean isSuccessful() {
        return !failed;
    }
}
