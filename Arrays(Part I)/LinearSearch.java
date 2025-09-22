import java.util.*;

public class LinearSearch {
    public static int LinearSearch(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int array[] = { 1, 5, 8, 24, 67, 45, 9, 50, 2, 4 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key which have to search in array :");
        int key = sc.nextInt();
        int index=LinearSearch(array,key);
        if(index==-1) {
            System.out.println("This key is not present in this array");
        }
        else{
            System.out.println("This key is present at index :"+ index );

        }


    }

}
