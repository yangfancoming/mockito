
package org.mockitousage.plugins.instantiator;

import org.mockito.internal.creation.instance.Instantiator;
import org.mockito.mock.MockCreationSettings;
import org.mockito.plugins.InstantiatorProvider;

@SuppressWarnings("deprecation")
public class MyInstantiatorProvider implements InstantiatorProvider {
    @Override
    public Instantiator getInstantiator(MockCreationSettings<?> settings) {
        throw new RuntimeException("Should never be called as there is InstantiatorProvider2 plugin");
    }
}
