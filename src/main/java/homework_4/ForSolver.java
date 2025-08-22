package homework_4;

import java.util.Scanner;

public class ForSolver {
    public static void main(String[] args) {
        //printNumbersDividableByThree();

        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //calculateSumFromOneToN(n);

        //multiplicationTable(n);

        //defineIfNumberPrime(n);

        printNumbers();
    }

    public static void printNumbersDividableByThree() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void calculateSumFromOneToN(int n) {
        //1 + 2 + 3+ 4 + 5 =
        // 5
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void multiplicationTable(int n) {
        int multResult;
        for (int i = 1; i <= 10; i++) {
            System.out.println(multResult = n * i);
        }
    }

    public static void defineIfNumberPrime(int n) {
        // 6 7
        // 2 3 4 5
        // 2 3 4 5 6

        boolean isPrime = true;

        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);

    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    
}
