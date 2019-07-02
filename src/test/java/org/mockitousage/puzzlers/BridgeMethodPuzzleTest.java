

package org.mockitousage.puzzlers;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockitoutil.TestBase;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockitoutil.Conditions.bridgeMethod;

/**
 * Bridge method is generated by compiler when erasure in parent class is
 * different. When is different then it means that in runtime we will have
 * overloading rather than overridding Therefore the compiler generates bridge
 * method in Subclass so that erasures are the same, signatures of methods match
 * and overridding is ON.
 */
@SuppressWarnings("unchecked")
public class BridgeMethodPuzzleTest extends TestBase {

    private class Super<T> {
        public String say(T t) {
            return "Super says: " + t;
        }
    }

    private class Sub extends Super<String> {
        @Override
        public String say(String t)  {
            return "Dummy says: " + t;
        }
    }

    @Test
    public void shouldHaveBridgeMethod() throws Exception {
        Super s = new Sub();

        assertEquals("Dummy says: Hello", s.say("Hello"));

        Assertions.assertThat(Sub.class).has(bridgeMethod("say"));
        Assertions.assertThat(s).has(bridgeMethod("say"));
    }

    @Test
    public void shouldVerifyCorrectlyWhenBridgeMethodCalled() throws Exception {
        //Super has following erasure: say(Object) which differs from Dummy.say(String)
        //mock has to detect it and do the super.say()
        Sub s = mock(Sub.class);
        Super<String> s_down = s;
        s_down.say("Hello");

        verify(s).say("Hello");
    }

    @Test
    public void shouldVerifyCorrectlyWhenBridgeMethodVerified() throws Exception {
        //Super has following erasure: say(Object) which differs from Dummy.say(String)
        //mock has to detect it and do the super.say()
        Sub s = mock(Sub.class);
        Super<String> s_down = s;
        s.say("Hello");

        verify(s_down).say("Hello");
    }
}
