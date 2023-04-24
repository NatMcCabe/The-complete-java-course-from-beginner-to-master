public class BankAccount {
    public String owner;
    public int balance;

    public BankAccount(String owner){
        this(owner, 0);
    }
    public BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner(){
        return owner;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){this.balance += amount;}
    }
    public void withdraw(int amount){
        if(amount > 0 && this.balance > amount){
            this.balance -= amount;
        }
        System.out.println("You cannot withdraw "+ amount + ", your balance is " + this.getBalance());
    }
}
