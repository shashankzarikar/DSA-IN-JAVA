public class Firstoccurence {
    public static int firstOcc (int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOcc(arr,i+1,key);
        
    }
    public static void main(String args[]) {
        int arr[] ={1,5,6,4,5,6,7,8,3,4,5,15};
        System.out.println("First Occurance at " +firstOcc(arr,0,16));

    }
    
}
