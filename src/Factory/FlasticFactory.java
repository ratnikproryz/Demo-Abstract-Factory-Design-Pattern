package Factory;

import Furniture.Chair;
import Furniture.FlasticTable;
import Furniture.PlasticChair;
import Furniture.Table;

public class FlasticFactory extends FurnitureAbstractFactory{
    public FlasticFactory(){

    }

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new FlasticTable();
    }
}
