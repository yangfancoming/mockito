
package org.mockito.internal.stubbing;

import org.mockito.stubbing.Answer;
import org.mockito.stubbing.OngoingStubbing;

public class ConsecutiveStubbing<T> extends BaseStubbing<T> {

    private final InvocationContainerImpl invocationContainer;

    ConsecutiveStubbing(InvocationContainerImpl invocationContainer) {
        super(invocationContainer.invokedMock());
        this.invocationContainer = invocationContainer;
    }

    public OngoingStubbing<T> thenAnswer(Answer<?> answer) {
        invocationContainer.addConsecutiveAnswer(answer);
        return this;
    }

}
