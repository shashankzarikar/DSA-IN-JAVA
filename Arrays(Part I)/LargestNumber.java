import java.util.*;

public class LargestNumber {
    public static int LargestNum(int array[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    public static int SmallestNum(int array[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int array[] = { 1, 5, 6, 77, 80, 96, 45, 23, 67, 100,-7 };
        System.out.println("Largest number in this array is : " + LargestNum(array));
        System.out.println("Smallest number in this array is : " + SmallestNum(array));

    }

}
