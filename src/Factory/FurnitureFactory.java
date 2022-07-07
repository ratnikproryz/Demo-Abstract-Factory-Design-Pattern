package Factory;

public class FurnitureFactory {
    private FurnitureFactory(){

    }
    public static FurnitureAbstractFactory getFactory(MaterialType type){
        switch (type){
            case FLASTIC:
                return new FlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw  new UnsupportedOperationException("This furniture is unspported");
        }
    }
}
