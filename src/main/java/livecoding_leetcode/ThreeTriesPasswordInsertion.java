package livecoding_leetcode;

import java.util.Scanner;

public class ThreeTriesPasswordInsertion {
    /*
    start a cycle where pointer - is a number of attempts..
    + cond if the pass is not correct - we print "Int pass" 3 times
    + when print "you hit the limit"

    + if it is correct -> "Pass is corr"
     */
    public static void main(String[] args) {
        passInput("Password");
    }

    public static void passInput(String correctPassword) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.println("Enter the password: ");
            String enteredPass = scanner.next();

            if (enteredPass.equals(correctPassword)) {
                System.out.println("Correct password. Access granted.");
                scanner.close();
                return;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Incorrect password. Try again.");
                }
            }
        }

        System.out.println("You've entered incorrect password 3 times! Access denied!");
        scanner.close();
    }
}