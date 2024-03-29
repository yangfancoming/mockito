
package org.mockito.internal.configuration.injection.filter;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

public interface MockCandidateFilter {
    OngoingInjector filterCandidate(
            Collection<Object> mocks,
            Field candidateFieldToBeInjected,
            List<Field> allRemainingCandidateFields,
            Object injectee
    );
}
