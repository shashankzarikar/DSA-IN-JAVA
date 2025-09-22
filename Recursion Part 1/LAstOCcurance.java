public class LAstOCcurance {
    public static int lastOcc(int arr[],int key,int i){
        if(arr[i]==key){
            return i;
        }
        if(i==0) {
            return -1;
        }
        return lastOcc(arr,key,i-1);

    }

    //  Second approach 

public static int lastOcc1 (int arr[],int key,int i) {
    if(i==arr.length ){
        return -1;
    }
    int isFound = lastOcc1(arr, key,i+1);


    if(isFound == -1 && arr[i]==key){
        return i;
    }
    return isFound;

}
    public static void main(String args[]){
        int arr []={1,5,6,4,5,6,7,8,3,4,5,6};
        System.out.println(lastOcc(arr,4,arr.length-1));
        System.out.println(lastOcc1(arr,4,0));

    }
    
}
