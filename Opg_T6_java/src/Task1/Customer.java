package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    public static int counter;

    public Customer(String firstName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
        counter++;
        this.id = counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}
