public class RemoveDuplicate {
    public static void removeDupli(String str,int index,StringBuilder newstr,boolean map[]){
       //Base case 
        if(index==str.length()){
            System.out.println(newstr);
            return;
        }
        // work
        char currchar=str.charAt(index);
        if(map[currchar-'a']==true){
            removeDupli(str,index+1,newstr,map);
         }
         else{
            map[currchar-'a']=true;
            removeDupli(str,index+1,newstr.append(currchar),map);
         }


    }
    public static void main(String args[]){
        String str="apppnnnacollage";
        removeDupli(str,0,new StringBuilder (""),new boolean [26] );
    }

}