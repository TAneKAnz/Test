package java;
public class Box {
    private double w, d ,h;

    //getter setter
    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    public double getD() {
        return d;
    }
    public void setD(double d) {
        this.d = d;
    }

    //constructor
    public Box() {

    }
    public Box(double w, double h , double d) {
        setW(w);
        setH(h);
        setD(d);
    }

    //method function
    public double volume() {
        return w*h*d;
    }
    public double surface() {
        return 2*((w*d) + (w*h) + (h*d));
    }

    //annotation
    @Override
    public String toString() {
        return String.format("width =  %.2f, height = %.2f, depth = %.2f", w, h, d);
    }
}
