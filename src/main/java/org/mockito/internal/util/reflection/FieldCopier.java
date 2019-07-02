
package org.mockito.internal.util.reflection;

import java.lang.reflect.Field;

public class FieldCopier {

    public <T> void copyValue(T from, T to, Field field) throws IllegalAccessException {
        Object value = field.get(from);
        field.set(to, value);
    }
}
