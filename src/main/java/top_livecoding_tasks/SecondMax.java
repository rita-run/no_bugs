package top_livecoding_tasks;

import java.lang.reflect.Array;

public class SecondMax {
    public static void main(String[] args) {
        //Find the second max number in an array
        //[1, 4, 3, 2, 5]
        //second max is: 4
    }

    public static int returnSecondMax(int[] array) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : array) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        } return second;
    }

}
