
package org.mockito.internal.util;

import org.mockito.plugins.MockitoLogger;

public class ConsoleMockitoLogger implements MockitoLogger {

    /* (non-Javadoc)
     * @see org.mockito.internal.util.Logger#print(java.lang.Object)
     */
    public void log(Object what) {
        System.out.println(what);
    }
}
