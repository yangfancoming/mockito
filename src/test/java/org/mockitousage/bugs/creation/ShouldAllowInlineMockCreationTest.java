

package org.mockitousage.bugs.creation;

import org.junit.Test;
import org.mockito.Mock;
import org.mockitoutil.TestBase;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//see issue 191
public class ShouldAllowInlineMockCreationTest extends TestBase {

    @Mock List list;

    @Test
    public void shouldAllowInlineMockCreation() {
        when(list.get(0)).thenReturn(mock(Set.class));
        assertTrue(list.get(0) instanceof Set);
    }
}
