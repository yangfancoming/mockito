
package org.mockito.internal.junit;

public interface TestFinishedEvent {

    Throwable getFailure();

    String getTestName();

}
