package practice_11.multithreads;

public class SumElements {
    //calculate sum of elements of a big array via
    //dividing to parts and splitting to threads
    //let's divide the array by 2 parts
    //the 1st array: 0 - array.length/2
    //the 2nd array: array.length/2 + 1 - array.length

    private static final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) throws InterruptedException {
        int sum = parallelSum(array);
        System.out.println("Sum: " + sum);
    }

    public static int parallelSum(int[] array) throws InterruptedException {
        int halfSize = array.length / 2;

        ThreadSum firstHalf = new ThreadSum(array, 0, halfSize);
        ThreadSum secondHalf = new ThreadSum(array,halfSize, array.length);

        Thread t1 = new Thread(firstHalf);
        Thread t2 = new Thread(secondHalf);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        return firstHalf.getSum() + secondHalf.getSum();
    }


}
