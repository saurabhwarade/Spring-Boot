import java.util.Scanner;

public class ATM {

    float balance = 0;
    int pin = 1234;

    Scanner scanner = new Scanner(System.in);

    public void checkPin() {
        System.out.println("Enter your PIN");
        float atmPin = scanner.nextInt();

        if (pin == atmPin) {
            menu();
        } else {
            System.out.println("Invalid Pin");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("1.Deposit");
        System.out.println("2.withdraw");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        int opt = scanner.nextInt();
        if (opt == 1) {
            System.out.println("Enter Amount");
            float amt = scanner.nextFloat();
            balance += amt;
            menu();
        } else if (opt == 2) {
            System.out.println("Enter Amount");
            float withdrawAmount = scanner.nextFloat();
            if (balance>=withdrawAmount) {
                balance -= withdrawAmount;
            }
            else {
                System.out.println("Insufficient Balance");
            }
            menu();
        } else if (opt == 3) {
            System.out.println("Available Balance is : " + balance);
            menu();


        } else if (opt == 4) {
            return;

        }
    }

    public static void main(String[] args) {


        ATM atm = new ATM();
        atm.checkPin();
    }
}