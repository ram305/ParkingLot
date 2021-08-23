import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String licenseNumber;
    private VehicleType type;
    public ParkingTicket currentParkingTicket = null;
    private List<ParkingTicket> parkingTickets = new ArrayList<>();

    public Vehicle(String licenseNumber, VehicleType type) {
        this.licenseNumber = licenseNumber;
        this.type = type;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public List<ParkingTicket> getParkingTickets() {
        return parkingTickets;
    }

    public ParkingTicket getCurrentParkingTicket() {
        return currentParkingTicket;
    }

    public void setCurrentParkingTicket(ParkingTicket currentParkingTicket) {
        this.currentParkingTicket = currentParkingTicket;
    }

    public void setParkingTickets(List<ParkingTicket> parkingTickets) {
        this.parkingTickets = parkingTickets;
    }

    public void printParkingTickets() {
        for (ParkingTicket parkingTicket : parkingTickets) {
            System.out.println("duration: " + parkingTicket.duration + "Price :" + parkingTicket.price);
        }
    }


}
