public class Subset {
    
    public static void subset(String str,StringBuilder newstr, int i){
         
        if(i==str.length()){ // basecase
           System.out.println(newstr);
           
           return;
           
        }
        // Yes choice
        
        subset(str,newstr.append(str.charAt(i)),i+1);
        //backtrack step , it is necessary because we used stringbuilder which modifies current string so backtrack to delete last element is necessary 
        newstr.deleteCharAt(newstr.length()-1);
       
        //no choice 
        subset(str,newstr,i+1);
         



    }
    public static void subset2(String str,String newstr,int i){
        // basecase
        if(str.length()==i){
            System.out.println(newstr);
            return;
        }
        // Yes choice 
        subset2(str,newstr+str.charAt(i),i+1);
        // No choice 
        subset2(str,newstr,i+1);
    }
    public static void main(String args[]){
        String str="abc";
        StringBuilder newstr=new StringBuilder(str.length());
       
        subset2(str,"",0);

    }
    
}
