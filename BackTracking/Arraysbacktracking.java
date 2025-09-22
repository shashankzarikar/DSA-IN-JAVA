public class Arraysbacktracking {
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void backtrack(int arr[], int val, int i) {
        if (i == arr.length) {
            printarr(arr);
            return;
        }
        arr[i] = val;
        backtrack(arr, val + 1, i + 1);
        arr[i] -= 2;

    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        backtrack(arr, 1, 0);
        printarr(arr);

    }
}