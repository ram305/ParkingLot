import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private String name;
    private List<ParkingFloor> parkingFloors = new ArrayList<>();
    private Map<String, ParkingSpot> vehicleParkingSpots = new HashMap<>();

    public void setName(String name) {
        this.name = name;
    }
    public Map<String, ParkingSpot> getVehicleParkingSpots() {
        return vehicleParkingSpots;
    }

    public void setVehicleParkingSpots(Map<String, ParkingSpot> vehicleParkingSpots) {
        this.vehicleParkingSpots = vehicleParkingSpots;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public boolean parkVehicle(Vehicle vehicle) throws ParkingLotFullException{
        ParkingSpot parkingSpot = bookParkingSpot(vehicle);
        if (parkingSpot == null) {
            System.out.println("Parking lot is full");
//            throw new ParkingLotFullException("Parking lot is full");
            return false;
        }
        System.out.println("Parking is done for :" + vehicle.getLicenseNumber());
        vehicleParkingSpots.put(vehicle.getLicenseNumber(), parkingSpot);
        return true;
    }

    public double removeVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = vehicleParkingSpots.get(vehicle.getLicenseNumber());
        double parkingPrice = parkingSpot.removeVehicle();
        return parkingPrice;
    }

    private ParkingSpot bookParkingSpot(Vehicle vehicle) {
        ParkingSpot spot = null;
        for (ParkingFloor parkingFloor : parkingFloors) {
             spot = parkingFloor.findAndBookSpot(vehicle);
                return spot;
        }
        return spot;
    }
