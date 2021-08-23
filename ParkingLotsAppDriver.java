import java.util.HashMap;
import java.util.Map;

public class ParkingLotsApp {

    public static ParkingLot createParkingLot(String name) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setName(name);
        for (int i=0;i<1; i++) {
            ParkingFloor parkingFloor = addnewParkingFloor();
            parkingLot.getParkingFloors().add(parkingFloor);
        }
        return parkingLot;
    }

    public static ParkingFloor addnewParkingFloor() {
        ParkingFloor parkingFloor = new ParkingFloor();
        for(int i=0; i<2; i++) {
            parkingFloor.getParkingSpots().add(new ParkingSpot(SpotType.Car, true));
        }
        for(int i=0; i<1; i++) {
            parkingFloor.getParkingSpots().add(new ParkingSpot(SpotType.Two_Wheeler, true));
        }
        return parkingFloor;
    }

    public static void main(String[] args) throws Exception {
        Map<String, ParkingLot> parkingLots = new HashMap<>();
        parkingLots.put("1", createParkingLot("1"));
//        parkingLots.put("2", createParkingLot("2"));
//        parkingLots.put("3", createParkingLot("3"));

        ParkingLot parkingLot = parkingLots.get("1");
        Vehicle vehicle1 = new Vehicle("12-2-1", VehicleType.Car);
//        Vehicle vehicle2 = new Vehicle("12-2-1", VehicleType.Car);
        Vehicle vehicle3 = new Vehicle("201-2-3", VehicleType.Two_Wheeler);
        parkingLot.parkVehicle(vehicle1);
//        parkingLot.parkVehicle(vehicle2);
        parkingLot.parkVehicle(vehicle3);

        System.out.println("Parking price: " + parkingLot.removeVehicle(vehicle1));
        System.out.println("Parking price: " + parkingLot.removeVehicle(vehicle3));
//        System.out.println("Parking price: " + parkingLot.removeVehicle(vehicle2));
        parkingLot.parkVehicle(vehicle1);
//        System.out.println("Parking price: " + parkingLot.removeVehicle(vehicle1));
        vehicle1.printParkingTickets();
    }
}
