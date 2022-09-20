import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer aygun = new Customer(1, "Aygun", "Najafova");
        customers.add(aygun);
        customers.add(new Customer(2, "Sakina", "Shukurova"));
        customers.add(new Customer(3, "Nergiz", "Hasanli"));

        customers.remove(aygun);

        for(Customer customer: customers) {
            System.out.println(customer.firstName);
        }
    }
}