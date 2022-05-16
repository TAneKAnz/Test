import java.time.LocalDate;

public class Person {
    private PersonName thName, enName;
    private LocalDate dob;
    
    
    public Person() {
    }
    public Person(PersonName thName, PersonName enName, LocalDate dob) {
        this.thName = thName;
        this.enName = enName;
        this.dob = dob;
    }

    public PersonName getThName() {
        return thName;
    }
    public void setThName(PersonName thName) {
        this.thName = thName;
    }
    public PersonName getEnName() {
        return enName;
    }
    public void setEnName(PersonName enName) {
        this.enName = enName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person [dob = " + dob + ", enName = " + enName + ", thName = " + thName + "]";
    }

}
