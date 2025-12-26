// First non repeating letters in a stram of characters

// Time Complexity=O(n) because each character in a string is added and removed from queue ony once
// Space Complexity=O(n)
import java.util.*;

public class FirstNonRepeatingLetter {
    public static void solution(String str) {
        Queue<Character> q = new LinkedList<>();
        int frequency[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            frequency[ch - 'a']++;
            while (!q.isEmpty()) {
                if (frequency[q.peek() - 'a'] == 1) {
                    System.out.print(q.peek()+" ");
                    break;
                } else {
                    q.remove();
                }
            }
            if (q.isEmpty()) {
                System.out.print(-1+" ");
            }
        }
    }

    public static void main(String args[]) {
        String str = "aabccxb";
        solution(str);

    }

}
