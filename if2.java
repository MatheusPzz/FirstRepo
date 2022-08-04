package pkgif;

import java.util.Scanner;

/**
 * Program to demonstrate the use of a simple if statement
 * @author Paul Kelly
 *
 */
public class If {

    public static void main(String[] args) {

        double accountBalance;
        double whatever;

        Scanner kb = new Scanner(System.in);

        System.out.print("What is your account balance? ");
        accountBalance = kb.nextDouble();
        
        if (accountBalance < 0) {
            System.out.println("Your account is in the red (overdrawn)");
        }

        if (accountBalance >= 0) {
            System.out.println("Your account is in the black (credit)");
        }

    }
//comment test//
}
