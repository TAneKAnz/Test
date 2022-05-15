package java.vehiclepass;
public class Bus implements Vehicle {

    @Override
    public int cashRate() {
        return 100;
    }

    @Override
    public int epassRate() {
        return 90;
    }
    
}
