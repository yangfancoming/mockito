
package org.mockito.invocation;

import org.mockito.NotExtensible;

/**
 * Describes the location of something in the source code.
 */
@NotExtensible
public interface Location {

    /**
     * Human readable location in the source code, see {@link Invocation#getLocation()}
     *
     * @return location
     */
    String toString();

    /**
     * Source file of this location
     *
     * @return source file
     * @since 2.24.6
     */
    String getSourceFile();
}
