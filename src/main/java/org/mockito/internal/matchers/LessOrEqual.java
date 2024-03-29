

package org.mockito.internal.matchers;

import java.io.Serializable;

public class LessOrEqual<T extends Comparable<T>> extends CompareTo<T> implements Serializable {

    public LessOrEqual(T value) {
        super(value);
    }

    @Override
    protected String getName() {
        return "leq";
    }

    @Override
    protected boolean matchResult(int result) {
        return result <= 0;
    }
}
