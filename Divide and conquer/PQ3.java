public class PQ3 {
    public static int crossinversioncount(int arr[],int si,int mid,int ei){
    int i=si;
    int j=mid+1;
    int k=0;
    int count=0;
    int temp[]= new int[ei-si+1];
    while(i<=mid&&j<=ei){
        if(arr[i]<=arr[j]){
            temp[k]=arr[i];
            k++;
            i++;

        }
        else{
            temp[k]=arr[j];
            j++;
            k++;
            count+=(mid-i+1);

        }
    }
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    while(j<=ei){
        temp[k++]=arr[j++];
    }
    for( k=0,i=si;k<temp.length;i++,k++){
        arr[i]=temp[k];
    }
    return count;

}
    public static int inversioncount(int arr[],int si,int ei){
        
        if(si==ei){
            return 0;
        }
    
      
       int mid=si+(ei-si)/2;

       int leftinversion= inversioncount(arr,si,mid); 
       int rightinversion= inversioncount(arr,mid+1,ei);
       int crossinversion=crossinversioncount(arr,si,mid,ei);
       return leftinversion+rightinversion+crossinversion;


    }
    public static void main(String args[]){
        int  arr[] = {2, 4, 1, 3, 5};
       int count= inversioncount(arr,0,arr.length-1);
       System.out.println(count);

    }

}