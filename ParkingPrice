public class ParkingPrice {

    int twoWheelerBasicPrice = 20;
    int fourWheelerBasicPrice = 30;
    int basicTime = 120;
    public static double findPrice(VehicleType vehicleType, int duration) {
        if(vehicleType == VehicleType.Two_Wheeler) {
            if(duration <= 120)
                return 20;
            else
                return 20+duration*10;
        } else {
            if(duration <= 120)
                return 30;
            else
                return 30+duration*15;
        }
    }
}
