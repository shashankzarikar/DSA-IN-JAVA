import java.util.*;

public class BinarySearch {
    public static int Binary(int array[], int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                end = mid - 1;
            }
            if (array[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 1, 3, 5, 7, 9, 11, 13, 56, 78, 89 };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = Binary(array, key);
        if (index == -1) {
            System.out.println("These is is not available in this array");
        } else {
            System.out.println("The required key is at index : " + index);
        }
    }

}
