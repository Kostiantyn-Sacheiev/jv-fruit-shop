package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;

public interface OperationService {
    void executeOperation(FruitTransaction transaction);
}
