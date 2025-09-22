public class StringCompression {
    public static String compression(String str) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            Integer num=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
               num++;
               i++;
            }
            sb.append(ch);
            if(num >1) {
                sb.append(num);
            }
            
        }
        return sb.toString();
    }
    public static void main(String args[] ){
        String str= "aaabbcccdd";
        System.out.println(compression(str));
    }
    
}
