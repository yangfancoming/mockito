
package org.mockito;

/**
 * @deprecated - please use {@link MockingDetails#printInvocations()} instead.
 * An instance of {@code MockingDetails} can be retrieved via {@link Mockito#mockingDetails(Object)}.
 */
@Deprecated
public interface MockitoDebugger {

    /**
     * @deprecated - please use {@link MockingDetails#printInvocations()} instead.
     * An instance of {@code MockingDetails} can be retrieved via {@link Mockito#mockingDetails(Object)}.
     */
    @Deprecated
    String printInvocations(Object ... mocks);
}
