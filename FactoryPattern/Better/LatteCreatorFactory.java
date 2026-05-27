package FactoryPattern.Better;

public class LatteCreatorFactory implements IngredientCreatorFactory{

    String milk;
    String sugar;

    LatteCreatorFactory(String milk, String sugar)
    {
            this.milk = milk;
            this.sugar = sugar;
    }

    @Override
    public String getMilk() {
        return this.milk;
    }

    @Override
    public String getSugar() {
        return this.sugar;
    } 
}
