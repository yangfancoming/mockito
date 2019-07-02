
package org.mockito.invocation;

/**
 * The information about stubbing, for example the location of stubbing.
 */
public interface StubInfo {

    /**
     * @return the location where the invocation was stubbed.
     */
    Location stubbedAt();
}
