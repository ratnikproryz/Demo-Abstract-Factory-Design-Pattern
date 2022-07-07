package Factory;

import Furniture.Chair;
import Furniture.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}
