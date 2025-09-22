public class Palindrome {
    public static boolean checkpalindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "racecar";
        if (checkpalindrome(str)) {
            System.out.println("Given string is palidrome");
        } else {
            System.out.println("Given string is not palidrome");

        }
    }
}