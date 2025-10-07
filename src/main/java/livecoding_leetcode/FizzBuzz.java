package livecoding_leetcode;

public class FizzBuzz {
    public static void main(String[] args) {
        //input: two parameters - the beginning and the end of a range
        //output: function that goes through the range and prints:
        //if the number is divisible by 3 - print fizz
        //if the number is divisible by 5 - print buzz
        //if the number is divisible by 5 AND by 3 - print fizzbuzz
        //if the number is NOT divisible by 5 NOR by 3 - print the number

        //input: 2, 15
        //{2, 3, ... 15}
        //output: 2, fizz, 4.. buzz, fizz, fizzbuzz

        //1) go through all the numbers in cycle and check the conditions
        printFizzBuzz(2, 15);
    }

    public static void printFizzBuzz(int begining, int end) {
        for (int i = begining; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizz buzz");
            } else if(i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else System.out.println(i);
        }
    }
}