package Task1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Customer morten = new Customer("Morten", "mor1");
        Customer svend = new Customer("Svend", "sve1");
        Customer terkel = new Customer("Terkel", "ter1");
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(morten);
        customers.add(svend);
        customers.add(terkel);
        printCustomers(customers);
    }
    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer c: customers){
            System.out.println(c);
        }
    }
}
