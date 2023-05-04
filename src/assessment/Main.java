package assessment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdvancedAccount ikAccount = new AdvancedAccount("IK", "1234");

        System.out.println("Initial balance is => "+ ikAccount.getBalance());

        System.out.println("Enter amount to deposit");
        double deposit = scanner.nextDouble();
        ikAccount.deposit(deposit);

        System.out.println("New balance is => "+ ikAccount.getBalance());

        System.out.println("Enter amount to withdraw");
        double withdraw = scanner.nextDouble();
        ikAccount.withdraw(withdraw, "1234");

        System.out.println("New balance is => "+ ikAccount.getBalance());
    }
}
