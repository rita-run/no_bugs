package homework_4;

import java.util.Scanner;

public class DoWhileSolver {
    public static void main(String[] args) {
        //enterPositiveNumber();

        //checkPass();

        //printNumbers();

        //enterExit();

        countDigits();
    }

    public static void enterPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Thank you, you did it right!");
    }

    public static void checkPass() {
        Scanner scanner = new Scanner(System.in);
        String pass = "";

        do {
            System.out.println("Enter the password: ");
            pass = scanner.nextLine();
        } while (!pass.equals("123"));

        System.out.println("Access is granted!");
    }

    public static void printNumbers() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void enterExit() {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Enter 'exit'");
            command = scanner.nextLine();
        } while (!command.equals("exit"));

        System.out.println("You've exited the system!");
    }

    public static void countDigits() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        //1 , 5 , 9 = 1
        //10-99 = 2
        //100 - 999 = 3
        //87
        //109889

        do {
            number = number / 10; //
            count++; //1 2 3 4 5 6
        } while (number > 0);

        System.out.println("The number of digits in this number is: " + count);
    }

}
