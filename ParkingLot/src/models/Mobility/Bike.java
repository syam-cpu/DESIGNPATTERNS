package ParkingLot.src.models.Mobility;

public class Bike  extends Vehicle{
    public Bike(String registrationNumber, String color)
    {
        super(registrationNumber, color, VehicleType.BIKE);
    }
}
