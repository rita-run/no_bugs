package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTask {
    public static void main(String[] args) {
        //проверка метода по угадыванию рандомного числа
        //findNumber(5);

        //проверка метода по поиска минимального введенного числа
        //findMin();

        //првоерка метода по введению пароля и логина
        checkCredentials();
    }

    public static void findNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(5);

        int number;

        do {
            System.out.print("Guess the number: ");
            number = scanner.nextInt();
        } while (number != random);

        System.out.println("You got it!");

    }

    public static void findMin() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = 2147483647;

        do {
            System.out.print("Insert a number: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;
        } while (number >= 0);

        System.out.println("The min number: " + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.print("Insert login: ");
            login = scanner.nextLine();
            System.out.print("Insert password: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Access is granted");


    }
}
