import java.util.*;

public class HeapImplementation{

    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){

            //Add at last index in array
            arr.add(data);

            //Fix heap
            int childIdx=arr.size()-1;
            int parIdx=(childIdx-1)/2;

            while(childIdx>0 && arr.get(childIdx)<arr.get(parIdx)){

                int temp=arr.get(childIdx);
                arr.set(childIdx,arr.get(parIdx));
                arr.set(parIdx,temp);

                childIdx=parIdx;
                parIdx=(childIdx-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){

            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            
            if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx=right;
            }

            //swap element at index i with minIdx
            if(minIdx!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);

                heapify(minIdx);
            }

        }

        public int remove(){
            int data=arr.get(0);

            //swap first and last element in arraylist
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //Delete last element
            arr.remove(arr.size()-1);

            //heapify at root
            if(!arr.isEmpty()){
                heapify(0);
            }

            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(1);
        h.add(8);
        h.add(7);
        h.add(4);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}