
package org.mockito.internal.matchers;

import java.io.Serializable;

/**
 * Internal interface that informs Mockito that the matcher is intended to capture varargs.
 * This information is needed when mockito collects the arguments.
 */
public interface VarargMatcher extends Serializable {
}
