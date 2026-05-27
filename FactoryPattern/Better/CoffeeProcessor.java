package FactoryPattern.Better;



public class CoffeeProcessor {

    public Coffee prepareCoffee(String whichCoffee, String whichMilk, String whichSugar, String whichCoffeeType)
    {
        Coffee coffee = new CoffeeFactory().getCoffee(whichCoffee,whichMilk, whichSugar, whichCoffeeType);
        return coffee;
    }
}
