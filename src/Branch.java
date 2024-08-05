import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initTransaction) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }


    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName().equalsIgnoreCase(name)) {
                return customers.get(i);
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "customers=" + customers +
                '}';
    }
}
