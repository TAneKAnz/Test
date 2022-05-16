package java.constructor;
public class Patient extends Person {
    private float height, weight;
    
    public Patient() {
        System.out.println("Patient constructor was called.");
    }
    
    public Patient(String firstName, String lastName, String nickName, String gender, float height, float weight) {
        super(firstName, lastName, nickName, gender);
        this.height = height;
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPatient [height=" + height + ", weight=" + weight + "]";
    }

    
    
}
