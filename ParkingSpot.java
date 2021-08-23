public class ParkingSpot {

    private SpotType spotType;
    private boolean available;
    private Vehicle vehicle;
    private Long startTime;

    public ParkingSpot(SpotType spotType, boolean available) {
        this.spotType = spotType;
        this.available = available;
    }

    public SpotType getSpotType() {
        return spotType;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void bookParkingSpot(Vehicle vehicle) {
        this.setAvailable(false);
        this.setVehicle(vehicle);
        this.setStartTime(1629546559000L);
    }

    public double removeVehicle() {
        int duration = (int)(System.currentTimeMillis() - this.getStartTime())/1000;
        ParkingTicket parkingTicket = vehicle.getCurrentParkingTicket();
        double price = parkingTicket.calculateParkingPrice(duration, vehicle.getType());
        this.setStartTime(null);
        this.setVehicle(null);
        this.setAvailable(true);
        return price;
    }
}
