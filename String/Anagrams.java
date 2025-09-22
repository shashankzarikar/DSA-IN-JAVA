import java.util.*;

public class Anagrams {
    // This is my logic to check anagrams
    public static boolean check(String str1, String str2) {
        boolean ans = true;
        if (str1.length() != str2.length()) {
            return false;

        }
        StringBuilder sb = new StringBuilder(str2);
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            for (int j = 0; j < sb.length(); j++) {
                if (ch == sb.charAt(j)) {
                    ans = true;
                    sb.deleteCharAt(j);

                    break;

                } else {
                    ans = false;
                }
            }
            if (ans == false) {
                return ans;
            }
        }

        return ans;
    }

    // This is optimised and better logic
    public static void optimised(String str1, String str2) {
        if (str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            if (Arrays.equals(str1charArray, str2charArray)) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }

        } else {
            System.out.println("Strings are not anagrams");

        }
    }

    public static void main(String args[]) {
        String str1 = "acc";
        String str2 = "aac";
       /*  if (check(str1, str2)) {
            System.out.println("Given strings are anagrams");
        } else {
            System.out.println("Given strings not are anagrams");

        }*/
        optimised(str1,str2);


    }

}
