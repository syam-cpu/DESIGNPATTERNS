package ParkingLot.src.models.Services;

import ParkingLot.src.models.Mobility.Vehicle;
import ParkingLot.src.models.Parking.FindSlotStrategy;
import ParkingLot.src.models.Parking.ParkingLot;
import ParkingLot.src.models.Parking.ParkingSlot;

public class ParkingLotService {
    private ParkingLot parkingLot;
    private FindSlotStrategy findSlotStrategy;
    
    
    public ParkingLotService(ParkingLot parkingLot, FindSlotStrategy findSlotStrategy)
    {
        this.parkingLot = parkingLot;
        this.findSlotStrategy = findSlotStrategy;
    }

    public void parkCar(Vehicle vehicle)
    {
        ParkingSlot slot = findSlotStrategy.findSlot(parkingLot, vehicle);

    }
}
