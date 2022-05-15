package java.vehiclepass;
public class Truck implements Vehicle {

    @Override
    public int cashRate() {
        return 80;
    }

    @Override
    public int epassRate() {
        return 70;
    }
    
}
