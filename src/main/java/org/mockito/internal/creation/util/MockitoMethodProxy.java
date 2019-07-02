
package org.mockito.internal.creation.util;

//TODO SF Replace with RealMethod and get rid of (possibly).
public interface MockitoMethodProxy {
    Object invokeSuper(Object target, Object[] arguments);
}
