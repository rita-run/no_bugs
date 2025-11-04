package livecoding_leetcode;

public class BinarySearch {
    /*
    Given: sorted array 5, 7, 9, 11
    goal: find the element 9 via binary search

    1) we divide the array by two = look for the middle (=7)
    2) and compare to the 7 elements from left and right
    int[] {5, 7} - int[] {9, 11} - compare what is the biggest
    LOGIC: if 7 is less than the look-for element (9), then the 9 is in the right part
    3) look ONLY in the right one
    4) then, we divide the array again
    {9} AND {11}
    5) and then again delete by two and compare which one is smaller --> 9
    OUTPUT: [9]
     */
    public static void main(String[] args) {

    }
}
