

package org.mockito.internal.matchers;

import org.mockito.ArgumentMatcher;

import java.io.Serializable;

public class Null implements ArgumentMatcher<Object>, Serializable {

    public static final Null NULL = new Null();

    private Null() {
    }

    public boolean matches(Object actual) {
        return actual == null;
    }

    public String toString() {
        return "isNull()";
    }
}
