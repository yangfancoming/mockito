

package org.mockito.internal.matchers;

import java.io.Serializable;

public class GreaterOrEqual<T extends Comparable<T>> extends CompareTo<T> implements Serializable {

    public GreaterOrEqual(T value) {
        super(value);
    }

    @Override
    protected String getName() {
        return "geq";
    }

    @Override
    protected boolean matchResult(int result) {
        return result >= 0;
    }
}
