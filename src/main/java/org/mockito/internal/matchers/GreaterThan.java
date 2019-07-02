

package org.mockito.internal.matchers;

import java.io.Serializable;

public class GreaterThan<T extends Comparable<T>> extends CompareTo<T> implements Serializable {

    public GreaterThan(T value) {
        super(value);
    }

    @Override
    protected String getName() {
        return "gt";
    }

    @Override
    protected boolean matchResult(int result) {
        return result > 0;
    }
}
