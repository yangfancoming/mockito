

package org.mockitousage.packageprotected;

import org.junit.Test;
import org.mockitoutil.TestBase;

import static org.mockito.Mockito.mock;

public class MockingPackageProtectedTest extends TestBase {

    static class Foo {}

    class Bar {}

    @SuppressWarnings({"CheckReturnValue", "MockitoUsage"})
    @Test
    public void shouldMockPackageProtectedClasses() {
        mock(PackageProtected.class);
        mock(Foo.class);
        mock(Bar.class);
    }
}
