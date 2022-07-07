import Factory.FurnitureAbstractFactory;
import Factory.FurnitureFactory;
import Factory.MaterialType;
import Furniture.Chair;
import Furniture.Table;

public class Client {
    public static void main(String[] args) {
//        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);
        Chair chair = factory.createChair();
        chair.create();
        Table table = factory.createTable();
        table.create();
    }
}
