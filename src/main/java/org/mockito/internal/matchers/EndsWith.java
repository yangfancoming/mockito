

package org.mockito.internal.matchers;

import java.io.Serializable;

import org.mockito.ArgumentMatcher;

public class EndsWith implements ArgumentMatcher<String>, Serializable {

    private final String suffix;

    public EndsWith(String suffix) {
        this.suffix = suffix;
    }

    public boolean matches(String actual) {
        return actual != null && actual.endsWith(suffix);
    }

    public String toString() {
        return "endsWith(\"" + suffix + "\")";
    }
}
