
package org.mockito.internal.debugging;

import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.invocation.Invocation;

public interface FindingsListener {
    void foundStubCalledWithDifferentArgs(Invocation unused, InvocationMatcher unstubbed);

    void foundUnusedStub(Invocation unused);

    void foundUnstubbed(InvocationMatcher unstubbed);
}
