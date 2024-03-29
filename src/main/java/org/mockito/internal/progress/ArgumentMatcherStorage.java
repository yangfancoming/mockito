
package org.mockito.internal.progress;

import org.mockito.ArgumentMatcher;
import org.mockito.internal.matchers.LocalizedMatcher;

import java.util.List;

@SuppressWarnings("unchecked")
public interface ArgumentMatcherStorage {

    void reportMatcher(ArgumentMatcher<?> matcher);

    List<LocalizedMatcher> pullLocalizedMatchers();

    void reportAnd();

    void reportNot();

    void reportOr();

    void validateState();

    void reset();

}
