package homework_4;

import java.util.Scanner;

public class BreakContinueSolver {
    public static void main(String[] args) {
        //calculateSum();
        //printNumbersMissingDividableByThree();
        //printPositiveNumbers();
        stopByCommand();
    }

    public static void calculateSum() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (number >= 0) { //true
            System.out.println("Enter a positive number: "); //-1
            number = scanner.nextInt(); //-1

            if (number < 0) {
                //System.out.println("Program is stopped");
                break;
            }

            sum = sum + number; //0 - 1 = -1
            System.out.println("The sum of the entered numbers is: " + sum); //-1
        }
        System.out.println("Number should be positive! Number has not been added to the sum! The sum of the entered numbers is: " + sum + " Program is stopped");
    }

    public static void printNumbersMissingDividableByThree() {
        for (int i = 1; i <= 20; i++) { //1
            if (i % 3 == 0) {
                continue; //false
            } System.out.println(i);
        }
    }

    public static void printPositiveNumbers() {
        // -2 -1 0 1 2 - 4 3 4 5
        // 1 2 3 4 5
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int i = scanner.nextInt();
            if (i <= 0) {
                continue;
            }
            System.out.println(i);
        }

    }

    public static void stopByCommand() {
        //Enter a line
        // continue
        //Enter a line
        //stop
        //"Stopped"
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a line: ");
            String string = scanner.nextLine();
            if (string.equals("stop")) {
                System.out.println("Stopped!");
                break;
            }
        }
    }

}
