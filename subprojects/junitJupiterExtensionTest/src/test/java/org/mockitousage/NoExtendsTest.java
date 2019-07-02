
package org.mockitousage;


import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class NoExtendsTest {

    @Mock
    private List<String> mock;

    @Test
    void runs() {
        when(mock.get(0)).thenReturn("foo");
        assertThat(mock.get(0)).isEqualTo("foo");
    }
}
