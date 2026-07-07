package ParkingLot.src.models.Mobility;

public class ElectricBike extends Vehicle implements ElectricVehicle{

    public ElectricBike(String registrationNumber, String color) {
        super(registrationNumber, color, VehicleType.ELECTRIC_BIKE);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void charge() {
        // TODO Auto-generated method stub
        System.out.println("Charging Electric Bike");
    }

    @Override
    public float getBatteryLevel() {
        // TODO Auto-generated method stub
        return 0;
    }
}
