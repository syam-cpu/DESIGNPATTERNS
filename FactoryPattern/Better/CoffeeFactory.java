package FactoryPattern.Better;

public class CoffeeFactory {

    public Coffee getCoffee(String whichCoffee, String whichMilk, String whichSugar, String whichCoffeeType)
    {
        Coffee coffee;

        if (whichCoffee.equals("Expresso"))
        {
            coffee = new Espresso();
        }
        else if(whichCoffee.equals("Latte"))
        {
            LatteCreatorFactory latteCreatorFactory =  new LatteCreatorFactory(whichMilk, whichSugar);
            coffee = new Latte(latteCreatorFactory);
        }
        else
        {
            coffee = new Cappucino();
        }
        return coffee;
    }
}
