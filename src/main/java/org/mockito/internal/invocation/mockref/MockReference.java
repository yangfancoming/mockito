

package org.mockito.internal.invocation.mockref;

import java.io.Serializable;

/**
 * To avoid memory leaks for certain implementations of MockMaker,
 * we need to use weak mock references internally. See #1313
 */
public interface MockReference<T> extends Serializable {
    T get();
}
