

package org.mockito.internal.progress;


import org.mockito.internal.verification.Times;
import org.mockito.internal.verification.VerificationModeFactory;

public class VerificationModeBuilder {

    private Integer times = 1;

    public Times inOrder() {
        return VerificationModeFactory.times(times);
    }

    public VerificationModeBuilder times(int times) {
        this.times = times;
        return this;
    }
}
