
package org.mockito.internal.junit;

public class DefaultTestFinishedEvent implements TestFinishedEvent {
    private final Object testClassInstance;
    private final String testMethodName;
    private final Throwable testFailure;

    public DefaultTestFinishedEvent(Object testClassInstance, String testMethodName, Throwable testFailure) {
        this.testClassInstance = testClassInstance;
        this.testMethodName = testMethodName;
        this.testFailure = testFailure;
    }

    @Override
    public Throwable getFailure() {
        return testFailure;
    }

    @Override
    public String getTestName() {
        return testClassInstance.getClass().getSimpleName() + "." + testMethodName;
    }
}
