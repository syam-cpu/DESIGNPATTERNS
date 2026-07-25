package ParkingLot.src.models.Parking;

import java.util.Optional;

import ParkingLot.src.models.Mobility.Vehicle;

public interface FindSlotStrategy {
    Optional<ParkingSlot> findSlot(ParkingLot parkingLot, Vehicle vehicle);
    
}
