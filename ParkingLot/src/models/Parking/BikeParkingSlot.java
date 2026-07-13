package ParkingLot.src.models.Parking;

import java.util.Arrays;
import java.util.List;

import ParkingLot.src.models.Mobility.VehicleType;

public class BikeParkingSlot extends ParkingSlot implements BikeSlot{

    private int bikeNumber;

    public BikeParkingSlot(int slotNumber, ParkingFloor floor) {
        super(slotNumber, floor, Arrays.asList(VehicleType.BIKE));
        //TODO Auto-generated constructor stub
    }

    public int getBikeNumber()
    {
        return bikeNumber;
    }

    public void setBikeNumber(int bikeNumber)
    {
        this.bikeNumber = bikeNumber;
    }
}
