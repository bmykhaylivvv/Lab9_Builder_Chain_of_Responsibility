package atm;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int amount = scanner.nextInt();

        System.out.println("Amount to withdraw " + amount);
        ATM atm = new ATM();
        atm.process(amount);
    }
}
