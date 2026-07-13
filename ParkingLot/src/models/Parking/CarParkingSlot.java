package ParkingLot.src.models.Parking;

import java.util.Arrays;
import java.util.List;

import ParkingLot.src.models.Mobility.VehicleType;

public class CarParkingSlot extends ParkingSlot implements CarSlot{

    private String carNumber;

    public CarParkingSlot(int slotNumber, ParkingFloor floor) {
        super(slotNumber, floor, Arrays.asList(VehicleType.CAR, VehicleType.BIKE));
    }
    
    private String getCarNumber()
    {
        return carNumber;
    }

    private void setCarNumber(String carNumber)
    {
        this.carNumber = carNumber;
    }
}
