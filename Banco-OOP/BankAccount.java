public class BankAccount{
    private String accountOwner;
    private double balance;
    
    public BankAccount(String accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public void showBalance(){
        System.out.println(String.format("The balance for the account %s is: %s", accountOwner, balance));
    }

    public void deposit(double ammount){
        if(ammount <= 0){
            System.out.println("Ammount cannot less or equals to cero");
            return;
        }
        this.balance += ammount;
        System.out.println("Money deposited succesfully");
        showBalance();
    }

    public void withdraw(double ammount){
        if(ammount <= 0){
            System.out.println("Ammount cannot less or equals to cero");
            return;
        }else if(ammount > balance){
            System.out.println("Ammount cannot be greater than the ammount in your balance");
            return;
        }
        this.balance -= ammount;
        System.out.println("Money withdrawn succesfully");
        showBalance();
    }
}