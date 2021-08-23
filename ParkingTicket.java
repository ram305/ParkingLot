public class ParkingTicket {
    ParkingSpot spot;
    int duration;
    double price;

//    public ParkingTicket(ParkingSpot spot, int duration, double price) {
//        this.spot = spot;
//        this.duration = duration;
//        this.price = price;
//    }

    public ParkingTicket(ParkingSpot spot) {
        this.spot = spot;
    }

    public double calculateParkingPrice(int duration, VehicleType vehicleType) {
        this.duration = duration;
        this.price = ParkingPrice.findPrice(vehicleType, duration);
        return price;
    }
}
