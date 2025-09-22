public class Search {
    public static int search(int arr[],int target,int si,int ei){
        //Base case 
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        //mid is on L1
        if(arr[si]<=arr[mid]){
            //case a:Left
            if(arr[si]<=target&&target<=arr[mid]){
                return search(arr,target,si,mid-1);
            }
            //case b:Right
            else{
                return search(arr,target,mid+1,ei);
            }
        }
        //mid is on L2
        else{
            //case a : Right
            if(arr[mid]<=target&&target<=arr[ei]){
                return search(arr,target,mid+1,ei);
            }
            //case b: Left
            else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,0,0,arr.length-1));

    }
    
}
