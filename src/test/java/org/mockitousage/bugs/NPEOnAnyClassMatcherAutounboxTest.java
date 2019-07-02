

package org.mockitousage.bugs;

import org.junit.Test;
import org.mockitoutil.TestBase;

import static org.mockito.Mockito.*;

//see issue 221
public class NPEOnAnyClassMatcherAutounboxTest extends TestBase {

    interface Foo {
        void bar(long id);
    }

    @Test
    public void shouldNotThrowNPE() {
        Foo f = mock(Foo.class);
        f.bar(1);
        verify(f).bar(any(Long.class));
    }
}
