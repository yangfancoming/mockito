

package org.mockito.internal.verification;

import org.mockito.invocation.Invocation;

import java.util.List;


public interface RegisteredInvocations {

    void add(Invocation invocation);

    void removeLast();

    List<Invocation> getAll();

    void clear();

    boolean isEmpty();

}
