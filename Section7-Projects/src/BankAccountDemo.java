public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount stevesBank = new BankAccount("Steve", 673);
        BankAccount mattsBank = new BankAccount("Matt", 1);

        System.out.println("Owner: " + mattsBank.getOwner());
        System.out.println("Balance: " + mattsBank.getBalance());
        mattsBank.withdraw(100);
    }
}
