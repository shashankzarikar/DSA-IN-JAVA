public class PairsInArray {
    public static void Pair(int array[]) {
        System.out.println("Possible all pairs in this array are : ");
        int tp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                System.out.print("(" + array[i] + "," + array[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are " + tp);

    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        Pair(array);

    }

}
