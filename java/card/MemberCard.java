package java.card;

public abstract class MemberCard {
    //private field
    private String firstName, lastName;

    //constructor
    public MemberCard() {
    }

    public MemberCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getter setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //methods
    public float discount(float amount) {
        if (amount >= 2000f) {
            return amount * .02f;
        } else {
            return 0f;
        }
    }

    public abstract float rewardPoint();                    //must implement this method in subclass
    public abstract boolean accessLounge();

    public final float calcPoint(float amount) {            //subclass cant override this method
        return (int)((amount / 20) * rewardPoint());
    }

    @Override
    public String toString() {
        return String.format("firstName = %s, lastName = %s", firstName, lastName);
    }
    
}
