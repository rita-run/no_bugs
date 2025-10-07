package livecoding_leetcode;

public class SumCalculatorWithCondition {
    public static void main(String[] args) {
        //calculate sum of all the nums that can be divided by 5 to n
        //n = 10
        //1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> 5 + 10 = 15
        //1) go throw the arr and find all the 5-dividable
        //2) collect them to list
        //3) calculate the sum
        System.out.println(returnSum(10));
    }

    public static int returnSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}