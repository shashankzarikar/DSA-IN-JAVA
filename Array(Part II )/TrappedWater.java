// this is my own solution 
public class TrappedWater {
    public static void Trappedwater(int heights[]) {
        int TrappedWater = 0;
        int width = 1;
        for (int i = 0; i < heights.length; i++) {
            int MaxLeft = 0;
            int MaxRight = 0;
            int j = i;
            while (j >= 0) {
                if (MaxLeft < heights[j]) {
                    MaxLeft = heights[j];
                }
                j--;
            }
            j = i;
            while (j < heights.length) {
                if (MaxRight < heights[j]) {
                    MaxRight = heights[j];
                }
                j++;
            }
            int waterlevel = Math.min(MaxLeft, MaxRight);
            TrappedWater = TrappedWater + (waterlevel - heights[i]) * width;

        }
        System.out.println("Total water can be stored is " + TrappedWater);
    }
    // This is optimised solution using auxiliary arrays

    public static void OptimisedSolution(int heights[]) {
        int TrappedWater = 0;
        int n = heights.length;
        if (n <= 2) {
            return;
        }
        int LeftMax[] = new int[n];
        int RightMax[] = new int[n];
        // find left max
        LeftMax[0] = heights[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(heights[i], LeftMax[i - 1]);
        }
        // find right max
        RightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(heights[i], RightMax[i + 1]);
        }
        // Calculate Trapped water
        for (int i = 0; i < heights.length; i++) {
            int waterlevel = Math.min(LeftMax[i], RightMax[i]);
            TrappedWater += (waterlevel - heights[i]);
        }
        System.out.println("Total water can be stored is " + TrappedWater);

    }

    public static void main(String args[]) {
        int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
        Trappedwater(heights);
        OptimisedSolution(heights);
    }

}
