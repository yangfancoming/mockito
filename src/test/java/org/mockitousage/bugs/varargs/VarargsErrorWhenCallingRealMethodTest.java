

package org.mockitousage.bugs.varargs;

import org.junit.Test;
import org.mockitoutil.TestBase;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class VarargsErrorWhenCallingRealMethodTest extends TestBase {

    class Foo {
        int blah(String a, String b, Object ... c) {
            return 1;
        }
    }

    @Test
    public void shouldNotThrowAnyException() throws Exception {
        Foo foo = mock(Foo.class);

        when(foo.blah(anyString(), anyString())).thenCallRealMethod();

        assertEquals(1, foo.blah("foo", "bar"));
    }
}
