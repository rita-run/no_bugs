package homework_4;

import java.util.Scanner;

public class WhileSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //calculateFactorial(n);
        //printAllEvenNumbers(n);

        printReverseSequence(n);

    }

    public static void calculateFactorial(int n) {
        //n = 5
        //1 2 3 4 5
        //result = 1 * 2
        // * 3 = 2 * 3 = 6

        int i = 1;
        int result = 1;

        while (i <= n) {
            result = result * i;
            //1 = 1 * 1;
            //1 = 1 * 2
            //2 = 2 * 3
            i++;
        }
        System.out.println(result);
    }

    public static void printAllEvenNumbers(int n) {
        int i = 2;

        //n = 4
        // 1 2 3 4
        // 1 % 2
        //

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }

    public static void printReverseSequence(int n) {
        //n = 5
        //5 4 3 2 1
        //5

        int i = n;

        while (i <= n) {
            if (i > 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
