
package org.mockito.internal.debugging;


import org.mockito.invocation.Location;

public class Localized<T> {

    private final T object;
    private final Location location;

    public Localized(T object) {
        this.object = object;
        location = new LocationImpl();
    }

    public T getObject() {
        return object;
    }

    public Location getLocation() {
        return location;
    }
}
