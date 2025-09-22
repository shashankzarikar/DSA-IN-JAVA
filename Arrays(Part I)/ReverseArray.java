public class ReverseArray{
    public static void Reverse(int array[]) {
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }


    }
    public static void main (String args[]) {
        int array[] ={2,5,7,8,4,3,69,78};
        Reverse(array);
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}