public class BasicSorting {
    public static void BubbleSort(int arr[]) {
        int swaps = 0;
        for (int turn = 0; turn < arr.length - 1; turn++) {
            
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
             if (swaps == 0) {
                    System.out.println("Array is already sorted");
                    return;

                }
        }

    }
    public static void SelectionSort(int arr[]) {
       for(int i=0;i<arr.length-1;i++) {
        int minPos=i;
        for(int j=i+1;j<arr.length;j++) {
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
            //Swap
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
        
       }
    }
    public static void InsertionSort(int arr[]) {
        for(int i=1;i<arr.length;i++) {
           int curr=arr[i];
           int prevPos=i-1;
           while (prevPos>=0 && arr[prevPos]>curr){
            arr[prevPos+1]=arr[prevPos];
            prevPos--;
          }
          arr[prevPos+1]=curr;   

        }
    }
    public static void CountingSort(int arr[]) {
        // Find to largest element to decide range of count array
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            largest=Math.max(arr[i],largest);
        }
        //Create count array to store the count(frequency) of numbers in array means treat numbers in array as index of counting array
        int count[]=new int [largest+1];//We have to store count of every number from 0 to Largest number
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        //Sorting 
        int j=0;
        for(int i=0;i<count.length;i++) {
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1,5,4,8,6,9,12,4,6,8};
       // BubbleSort(arr);
       CountingSort(arr);
        printArray(arr);
    } 
}