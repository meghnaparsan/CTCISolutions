// Implement a function to check if a linked list is a palindrome

import java.util.ArrayList;

import Utils.BuildList;
import Utils.Node;

public class Palindrome {
    public static void main (String [] args) {
        int[] data = { 1, 2, 2, 1 };

        Node head = null;
        BuildList dataList = new BuildList();

        for (int num : data) {
            head = dataList.insertEnd(num, head);
        }

        if (isPalindrome (head)) {
            System.out.println ("The list is a Palindrome");
        }

        else {
            System.out.println ("The list is not a Palindrome");
        }
    }

    // Method 1 - O (n) Space 
    private static boolean isPalindrome(Node head) {
        ArrayList <Integer> elements = new ArrayList <>();
        
        Node temp = head;
        
        while (temp != null) {
            elements.add (temp.data);
            temp = temp.next;
        }
        
        int start = 0;
        int end = elements.size() - 1;
        
        while (start < end) {
            if (!elements.get (start).equals (elements.get (end))) {
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }
}
