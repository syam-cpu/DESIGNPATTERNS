package ParkingLot.src.models.Parking;

import ParkingLot.src.models.Mobility.Vehicle;

public class LinerSearchFindingStrategy implements FindSlotStrategy{

    @Override
    public ParkingSlot findSlot(ParkingLot parkingLot, Vehicle vehicle) {
        for (ParkingFloor floor : parkingLot.getFloors())
        {
            for (ParkingSlot slot : floor.getParkingSlots())
            {
                if (slot.isSlotAvailable() && slot.isVehicleTypeSupported(vehicle))
                {
                    slot.display();
                    return slot;
                }
            }
        }
        System.out.println("No slot available");
        return null;
    }
    
}
