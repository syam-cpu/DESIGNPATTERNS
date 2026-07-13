package ParkingLot.src.models.Parking;

import ParkingLot.src.models.Mobility.Vehicle;

public interface FindSlotStrategy {
    ParkingSlot findSlot(ParkingLot parkingLot, Vehicle vehicle);
    
}
