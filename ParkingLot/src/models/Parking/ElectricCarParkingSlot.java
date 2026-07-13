package ParkingLot.src.models.Parking;

import java.util.Arrays;
import java.util.List;

import ParkingLot.src.models.Mobility.VehicleType;

public class ElectricCarParkingSlot extends ParkingSlot implements ElectricSlot, CarSlot{

    public ElectricCarParkingSlot(int slotNumber, ParkingFloor floor) {
        super(slotNumber, floor, Arrays.asList(VehicleType.ELECTRIC_BIKE, VehicleType.ELECTRIC_CAR));
    }

    @Override
    public void Charge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Charge'");
    }
    
}
