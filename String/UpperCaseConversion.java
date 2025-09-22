public class UpperCaseConversion {
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(i==0 || str.charAt(i-1)==' '){
                 ch = Character.toUpperCase(ch);
                 }
            sb.append(ch);
         }
         String answer= sb.toString();
         return answer;
         
    }
    public static void main(String args[]) {
        String str="hi, i am romit";
       System.out.println( touppercase(str));
    }
    
}
 