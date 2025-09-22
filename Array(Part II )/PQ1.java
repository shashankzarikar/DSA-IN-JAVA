public class PQ1 {
    public static boolean answer(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int CurrNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (CurrNum == nums[j]) {
                    return true;
                }

            }
        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(answer(nums));
    }

}
