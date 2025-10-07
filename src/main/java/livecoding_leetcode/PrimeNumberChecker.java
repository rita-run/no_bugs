package livecoding_leetcode;

import java.util.List;

public class PrimeNumberChecker {
    //10 2 3 6
    //true, true, true, false
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(2, 1003, 10, 1, 0);
        listOfNumbers.forEach(n -> System.out.println("Number " + n + " is prime? " + isPrime(n)));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            //2; 2 * 2 = 4 < 10 (= true);
            //3; 9 < 10;
            //4; 12 > 10 (false)
            if (num % i == 0) return false;
        }
        return true;
    }
}