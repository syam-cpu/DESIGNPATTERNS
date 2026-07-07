package ParkingLot.src.models.Parking;

import java.util.List;
import java.util.Optional;

import ParkingLot.src.models.Mobility.VehicleType;

public abstract class ParkingSlot {
    private List<VehicleType> SupportedVehicleTypes;
    private ParkingSlotStatus parkingSlotStatus;

    private int slotNumber;
    private ParkingFloor floor;
    private Optional<ParkingLot.src.models.Mobility.Vehicle> Vehicle;

    public ParkingSlot(int slotNumber, ParkingFloor floor)
    {
        this.slotNumber = slotNumber;
        this.floor = floor;
        this.parkingSlotStatus = ParkingSlotStatus.EMPTY;
        this.floor.addParkingSlot(this);
    }

    public Optional<ParkingLot.src.models.Mobility.Vehicle> getVehicle()
    {
        return Vehicle;
    }

    public void removeVehicle()
    {
        this.parkingSlotStatus = ParkingSlotStatus.EMPTY;
        this.Vehicle = Optional.empty();
    }


}
