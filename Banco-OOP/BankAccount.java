public class BankAccount{
    private String accountOwner;
    private double balance;
    
    public BankAccount(String accountOwner, double balance) {
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public void showBalance(){
        System.out.println(String.format("New balance is: %s", balance));
    }

    public void deposit(double ammount){
        if(ammount <= 0){
            System.out.println("Ammount cannot less or equals to cero");
            return;
        }
        this.balance += ammount;
        System.out.println("Money deposited succesfully");
        
    }
}