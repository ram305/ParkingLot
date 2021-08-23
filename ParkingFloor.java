import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingFloor {
    private List<ParkingSpot> parkingSpots = new ArrayList<>();

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findAndBookSpot(Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable() && isSpotCompatible(spot.getSpotType(), vehicle.getType())) {
                spot.bookParkingSpot(vehicle);
                generateParkingTicket(vehicle, spot);
                return spot;
            }
        }
        return null;
    }



    private void generateParkingTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        ParkingTicket parkingTicket = new ParkingTicket(parkingSpot);
        vehicle.setCurrentParkingTicket(parkingTicket);
        vehicle.getParkingTickets().add(parkingTicket);
    }

    private boolean isSpotCompatible(SpotType spotType, VehicleType vehicleType) {
        if (spotType == SpotType.Two_Wheeler && vehicleType == VehicleType.Two_Wheeler)
            return true;
        if (spotType == SpotType.Car && vehicleType == VehicleType.Car)
            return true;
        return false;
    }
}
