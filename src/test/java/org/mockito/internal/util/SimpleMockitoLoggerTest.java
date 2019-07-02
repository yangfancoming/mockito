
package org.mockito.internal.util;

import org.junit.Test;
import org.mockitoutil.TestBase;

import static org.junit.Assert.assertEquals;

public class SimpleMockitoLoggerTest extends TestBase {

    @Test
    public void shouldLog() throws Exception {
        //given
        SimpleMockitoLogger logger = new SimpleMockitoLogger();
        //when
        logger.log("foo");
        //then
        assertEquals("foo", logger.getLoggedInfo());
    }
}
