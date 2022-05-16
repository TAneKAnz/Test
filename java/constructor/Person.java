package java.constructor;
public class Person {
    private String firstName, lastName, nickName, gender;

    static {
        System.out.println("Static initializer was called.");
    }

    public Person() {
        System.out.println("Person constructor was called.");
    }
    
    //chain constructor
    public Person(String firstName, String lastName) {
        this(firstName, lastName, "", "");
    }

    public Person(String firstName, String lastName, String nickName, String gender) {
        setFirstName(firstName);
        this.lastName = lastName;
        this.nickName = nickName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.trim().substring(0,1).toUpperCase() + firstName.trim().substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", gender=" + gender + ", lastName=" + lastName + ", nickName="
                + nickName + "]";
    }
    

    
}
