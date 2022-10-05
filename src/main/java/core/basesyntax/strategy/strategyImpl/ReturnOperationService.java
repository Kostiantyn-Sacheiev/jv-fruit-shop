package core.basesyntax.strategy.strategyImpl;

import core.basesyntax.dao.FruitDao;
import core.basesyntax.model.Fruit;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationService;

public class ReturnOperationService implements OperationService {
    private FruitDao fruitDao;

    public ReturnOperationService(FruitDao fruitDao) {
        this.fruitDao = fruitDao;
    }

    @Override
    public void executeOperation(FruitTransaction transaction) {
        Fruit fruit = transaction.getFruit();
        fruitDao.update(fruit, fruitDao.getQuantity(fruit) + transaction.getQuantity());
    }
}
