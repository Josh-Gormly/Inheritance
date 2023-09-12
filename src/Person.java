import java.util.Calendar;
import java.util.Date;
public class Person
{
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int yearOfBirth;

    public Person(String ID, String firstName, String lastName, String title, int yearOfBirth) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.yearOfBirth = yearOfBirth;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
    public String toCSVDataRecord()
    {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + yearOfBirth;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String getFormalName()
    {
        return title + " " + firstName + " " + lastName;
    }

    public int getAge() {
        return Calendar.YEAR - yearOfBirth;
    }

    public int getAge(int year)
    {
        ;
        return (year - yearOfBirth);
    }
}
