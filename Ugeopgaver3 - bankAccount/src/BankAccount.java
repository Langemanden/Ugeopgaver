
import java.util.Scanner;

public class BankAccount {
    double balance = 0;
    String accountName;
    Scanner scanner = new Scanner(System.in);

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void printBalance() {
        System.out.println(accountName + " har " + balance + " kr");
    }

    void main() {

        BankAccount account = new BankAccount();
        account.accountName = "Sofus";

        account.printBalance();

        System.out.print("Hvor mange penge vil du indsætte? ");
        double amount = scanner.nextDouble();
        account.deposit(amount);

        account.printBalance();

        System.out.print("Hvor mange penge vil du hæve? ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        account.printBalance();
    }
}