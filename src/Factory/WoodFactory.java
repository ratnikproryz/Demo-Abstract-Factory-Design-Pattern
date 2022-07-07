package Factory;

import Furniture.Chair;
import Furniture.Table;
import Furniture.WoodChair;
import Furniture.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory{
    public WoodFactory(){

    }
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
