package ParkingLot.src.models.Parking;

import java.util.List;

import ParkingLot.src.models.Services.ParkingLotService;

public class ParkingLot {
    private List<ParkingFloor> floors;
    ParkingLotService parkingLotService;

    public ParkingLot(List<ParkingFloor> floors)
    {
        this.floors = floors;
        this.parkingLotService = new ParkingLotService();
    }

    public void addParkingFloor(ParkingFloor parkingFloor)
    {
        this.floors.add(parkingFloor);
    }

    public void removeParkingFloor(ParkingFloor parkingFloor)
    {
        this.floors.remove(parkingFloor);
    }

    public List<ParkingFloor> getFloors()
    {
        return this.floors;
    }
}
