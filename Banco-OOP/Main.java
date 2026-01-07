public class Main{
    public static void main(String[] args) {
        BankApp app = new BankApp(new BankAccount("Justin", 1000));

        app.run();
    }
}