package ParkingLot.src.models.Factory;

import ParkingLot.src.models.Parking.FindSlotStrategy;
import ParkingLot.src.models.Parking.LinerSearchFindingStrategy;

public class FindSlotFindingStrategy {
    public static FindSlotStrategy createLinearSerchFindSlotStrategy()
    {
        return new LinerSearchFindingStrategy();
    }
}
