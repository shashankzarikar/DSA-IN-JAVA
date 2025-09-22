public class PracticeQuestions {
    public static void PrintArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int arr[]) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {// if one turn is completed then one element is already at its
                                                          // correct position so arr.length-1-i
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) {
                System.out.println("It is sorted array");
                return;
            }

        }
    }
    public static void SelectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++) {
            int maxPos=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[maxPos]<arr[j]){
                    maxPos=j;
                }
             }
             int temp=arr[i];
             arr[i]=arr[maxPos];
             arr[maxPos]=temp;
        }
    }
    public static void InsertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]<curr) {
                arr[prev+1]=arr[prev];
                prev--;
             }
             arr[prev+1]=curr;


        }
        
            
    }   
        public static void CountingSort(Integer arr[]) {
            //Find the MaxValue in array to decide size of count array
            int MaxValue=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++) {
                MaxValue=Math.max(MaxValue,arr[i]);
            }
            //Create Counting array
            int count[]=new int[MaxValue+1];
            //Fill count array
            for(int i=0;i<arr.length;i++) {
                count[arr[i]]++;
            }
            //Sort array in descending order
            int j=0;
            for(int i=count.length-1;i>=0;i--) {
                while(count[i]>0) {
                    arr[j]=i;
                    j++;
                    count[i]--;

                }
            }
        
        }
    

    public static void main(String args[]) {
        Integer arr[] = {3,6,2,1,8,7,4,5,3,1 };
        CountingSort(arr);
        PrintArray(arr);
    }

}
