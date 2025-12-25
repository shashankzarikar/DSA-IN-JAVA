//Check valid parenthesis 
//Time Complexity=O(n)
import java.util.*;
public class Validparenthesis {
    public static boolean checkvalidparenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }
            else {
                if(s.isEmpty()){
                    return false;
                }
                char top=s.pop();
                if (ch==')' && top!='(' ||ch=='}' && top!='{' || ch==']' && top!='['){
                return false;
              }
              
            } 
    }
    return s.isEmpty();
    
}
    public static void main(String args[]){
        String str="]";
        System.out.println(checkvalidparenthesis(str));

    }
    
}
