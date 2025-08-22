package practice_4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        //multiplyTable(5);

        //check for sum of all the numbers to the number
        System.out.println(sumOfAllNumbers(10));

        System.out.println(checkNumberIsSimple(10));


    }

    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumbers(int n) {
        int sum = 0;

        //step 1 i 1 n 1
        //step 2 sum 3 i 3 sum 6
        for (int  i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static boolean checkNumberIsSimple(int number) {
        //simple number is a number that can be divided only by 1 and by itself
        //we need to iterate from 1 to number and check if there is a number divided by that we can have 0 as остаток, then the number is not simple
        // ex 7
        //2 , 3 , 4 , 5
        //2
        //6
        //2
        boolean isSimple = true;

        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;


    }


}
