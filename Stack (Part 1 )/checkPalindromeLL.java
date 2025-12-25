/*Palindrome Linked List We have a singly linked list of characters,write a function that 
returns true if the given list is a palindrome , else false */

// Time Complexity=O(n)
// Space Complexity=O(n)
import java.util.*;
public class checkPalindromeLL {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static boolean isPalindrome(Node head){
        Stack<Integer> s=new Stack<>();
        Node slow=head;
        while(slow!=null){
            s.push(slow.data);
            slow=slow.next;
        }
        
        while(head!=null){
            int i=head.data;
            int top=s.pop();
            if(top!=i){
                return false;
            }
            else{
                head=head.next;
            }
        }
        return true;
        
    }
    public static void main(String args[]){
        Node one = new Node(1);
        Node two=new Node(2);
        Node three = new Node (3);
        Node four=new Node(4);
        Node five=new Node(3);
        Node six=new Node(2);
        Node seven=new Node(1);
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;


    }
    
}
