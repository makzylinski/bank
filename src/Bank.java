import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) != null) {
            return false;
        }

        branches.add(new Branch(branchName));
        System.out.println("New Branch has been added, name " + branchName);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if(findBranch(branchName) == null) {
            return false;
        }

        Branch branch = findBranch(branchName);
        branch.newCustomer(customerName, initialTransaction);
        return true;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if(findBranch(branchName) == null) {
            return false;
        }

        Branch branch = findBranch(branchName);
        branch.addCustomerTransaction(customerName, transaction);
        return true;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size() - 1; i++) {
            if(branches.get(i).getName().equalsIgnoreCase(branchName)) {
                return branches.get(i);
            }
        }

        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        System.out.println(branches);
        if(findBranch(branchName) != null) {
            return false;
        }
        System.out.println(branches);
        if(printTransactions) {


            System.out.println("Customer details for branch " + branchName);
//            System.out.println("Customer: " + );
        }

        return false;
    }
}
