public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("PKO");
        bank.addBranch("test");
        bank.listCustomers("test", true);
    }
}
