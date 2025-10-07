package livecoding_leetcode;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("The max sum of subarray of length k is: " + findMaxSumSubarray(arr, k));
    }

    public static int findMaxSumSubarray(int[] arr, int k) {
        if (arr.length < k) {
            throw new IllegalArgumentException("Size of the window is bigger than the array");
        }

        //1. calculate sum of the 1st 3 elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            //every iteration we add number of the next index to the sum -> 2 + 1 + 5
            windowSum+=arr[i];
        }

        int maxSum = windowSum;

        //2. slide through the array
        for (int i = k; i < arr.length; i++) {
            //subtrack the 1st element of the previous window, and add the next one
            windowSum = windowSum - arr[i - k] + arr[i];
            //windowSum = 8
            //windowSum = 8 - 2 + 1 = 7
            //then compare the sums
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}