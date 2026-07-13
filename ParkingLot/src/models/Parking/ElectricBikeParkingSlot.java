package ParkingLot.src.models.Parking;

import java.util.Arrays;
import java.util.List;

import ParkingLot.src.models.Mobility.VehicleType;

public class ElectricBikeParkingSlot extends ParkingSlot implements ElectricSlot, BikeSlot {

    public ElectricBikeParkingSlot(int slotNumber, ParkingFloor floor) {
        super(slotNumber, floor, Arrays.asList(VehicleType.BIKE, VehicleType.ELECTRIC_BIKE));
    }

    @Override
    public void Charge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Charge'");
    }
    
    
}
