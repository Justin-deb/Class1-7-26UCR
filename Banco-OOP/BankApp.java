import java.util.Scanner;

public class BankApp{
    private BankAccount bankAccount;
    private Scanner scanner;

    public BankApp(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        scanner = new Scanner(System.in);
    }

    public void showMenu(){
        System.out.println("Welcome to the banking app \n"+
                        "1 Deposit money \n" + 
                        "2 Withdraw money \n" + 
                        "3 Show balance \n" + 
                        "4 Exit");
    }
    public boolean userInput(){
        int option = Integer.parseInt(scanner.nextLine());
        int ammount;
        switch (option) {
            case 1:
                System.out.println("Enter the amount to deposit");
                ammount = Integer.parseInt(scanner.nextLine());
                bankAccount.deposit(ammount);
                break;
            case 2:
                System.out.println("Enter the amount to deposit");
                ammount = Integer.parseInt(scanner.nextLine());
                bankAccount.withdraw(ammount);
                break;
            case 3:
                bankAccount.showBalance();
                break;
            case 4:
                System.out.println("Bye!");
                scanner.close();
                return true;
            default:
                System.out.println("Option not valid");
                break;
        }
        return false;
    }

    public void run(){
        while (true) {
            showMenu();
            boolean exit = userInput();
            if(exit){
                scanner.close();
                return;
            }
        }
    }
}