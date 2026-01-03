import java.util.*;

public class PQ3 {
    public static class Job{
    char id;
    int profit;
    int deadline;
    Job(char id,int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }

    }

    public static char [] jobSequencing(ArrayList<Job> jobs){

        // sort all jobs according to profit in descending order
        Collections.sort(jobs,(a,b)->b.profit-a.profit);

        //Find max deadline
        int maxdeadline=0;
        for(Job job:jobs){
            maxdeadline=Math.max(maxdeadline,job.deadline);
         }
         
         // create slots array 
        char slots[]=new char[maxdeadline+1];
        for(int i=0;i<slots.length;i++){
            slots[i]='-';
        }
        
        // scehedule jobs
        for(Job job :jobs){
           for(int i=job.deadline;i>0;i--){
            if(slots[i]=='-'){
                slots[i]=job.id;
                break;
            }
           }
        }

        return slots;



    }
    public static void main(String args[]){
         ArrayList<Job> jobs=new ArrayList<>();
         jobs.add(new Job('a',4,20));
         jobs.add(new Job('b',1,10));
         jobs.add(new Job('c',1,40));
         jobs.add(new Job('d',1,30));

         char arr[]=jobSequencing(jobs);
         for(int i=1;i<arr.length;i++){
            if(arr[i]!='-'){
                System.out.print(arr[i]+" ");
            }
            
         }

    }
    
}
