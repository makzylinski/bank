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
        if(findCustomer(name) != null) {
            return false;
        }
        new Customer(name, initTransaction);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        if(findCustomer(name) == null) {
            return false;
        }

        if(Double.valueOf(transaction) != null) {
            return false;
        }

        findCustomer(name).addTransaction(transaction);
        return true;
    }


    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size() - 1; i++) {
            if(customers.get(i).getName().equalsIgnoreCase(name)) {
                return customers.get(i);
            }
        }

        return null;
    }
}
