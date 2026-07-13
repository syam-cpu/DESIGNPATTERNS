package ParkingLot.src.models.Parking;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import ParkingLot.src.models.Mobility.Vehicle;
import ParkingLot.src.models.Mobility.VehicleType;

public abstract class ParkingSlot {
    private final List<VehicleType> SupportedVehicleTypes;
    private final int slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private ParkingFloor floor;
    private Optional<Vehicle> Vehicle;

    public ParkingSlot(int slotNumber, ParkingFloor floor, List<VehicleType> supportedVehicleTypes)
    {
        this.slotNumber = slotNumber;
        this.floor = floor;
        this.parkingSlotStatus = ParkingSlotStatus.EMPTY;
        this.floor.addParkingSlot(this);
        this.SupportedVehicleTypes = supportedVehicleTypes;
    }

    public Optional<Vehicle> getVehicle()
    {
        return Vehicle;
    }

    public void removeVehicle()
    {
        this.parkingSlotStatus = ParkingSlotStatus.EMPTY;
        this.Vehicle = Optional.empty();
    }

    public int getSlotNumber()
    {
        return slotNumber;
    }

    public ParkingSlotStatus getStatus()
    {
        return parkingSlotStatus;
    }

    public void setStatus(ParkingSlotStatus status)
    {
        this.parkingSlotStatus = status;
    }

    public ParkingFloor getFloor()
    {
        return floor;
    }

    public void setFloor(ParkingFloor floor)
    {
        this.floor = floor;
    }

    public void setVehicle(Optional<Vehicle> vehicle)
    {
        this.Vehicle = vehicle;
    }

    public List<VehicleType> getSupportedTypes()
    {
        return SupportedVehicleTypes;
    }

    public boolean isSlotAvailable()
    {
        return this.parkingSlotStatus == ParkingSlotStatus.EMPTY;
    }

    public boolean isVehicleTypeSupported(Vehicle vehicle)
    {
        return SupportedVehicleTypes.contains(vehicle.getType());
    } 

    public void display()
    {
        System.out.println("Slot Number: " + slotNumber);
        System.out.println("Slot Status: " + parkingSlotStatus);
        System.out.println("Supported Vehicle Types : " + Arrays.toString(SupportedVehicleTypes.toArray()));
        if (Vehicle.get().isPresent())
        {
            System.out.println("Parking Vehicle" + Vehicle.get().getRegistrationNumber());
        }

    }
}
