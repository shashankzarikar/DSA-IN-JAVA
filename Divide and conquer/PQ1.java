public class PQ1 {
     public static void printarr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}
        }
    public static void merge(String arr[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid&&j<=ei){
            int p=0;
            if(arr[i].charAt(p)==arr[j].charAt(p)){
                p++;
            }
            if(arr[i].charAt(p)<arr[j].charAt(p)){
                temp[k]=arr[i];
                i++;
                k++;
            }
            if(arr[i].charAt(p)>arr[j].charAt(p)){
                temp[k]=arr[j];
                j++;
                k++;
            }

        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void mergesort(String arr[],int si,int ei){
        if(si>=ei){
            return ;
        }
        int mid=si+(ei-si)/2;

        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void main(String args[]){
       String arr[] = {"sun", "earth", "mars", "mercury"};
       mergesort(arr,0,arr.length-1);
       printarr(arr);

    }
    
}
