package java.vehiclepass;
public class Sedan implements Vehicle {

    @Override
    public int cashRate() {
        return 50;
    }

    @Override
    public int epassRate() {
        return 40;
    }
    
}
