package ParkingLot.src.models.Mobility;

public class ElectricCar extends Vehicle implements ElectricVehicle{

    public ElectricCar(String registrationNumber, String color) {
        super(registrationNumber, color, VehicleType.ELECTRIC_CAR);
    }

    @Override
    public void charge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'charge'");
    }

    @Override
    public float getBatteryLevel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBatteryLevel'");
    }
}
