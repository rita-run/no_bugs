package livecoding_leetcode;

public class ArraySum {
    public static void main(String[] args) {
        //1, 2, 3, 4
        //sum = 10
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
    }
}