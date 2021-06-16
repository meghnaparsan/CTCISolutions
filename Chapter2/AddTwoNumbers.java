/* You have two numbers represented by a linked list, where each node contains a single digit. 
The digits are stored in reserve order, such that 1's is at the head of the list. Write a function that adds the two numbers
and returns the sum as a linked list. */

import java.util.Stack;

import Utils.BuildList;
import Utils.Node;

class AddTwoNumbers {
    public static void main (String [] args) {
        int[] data1 = { 9, 9, 9, 9, 9, 9, 9 };
        int[] data2 = { 9, 9, 9, 9 };

        Node head1 = null;
        Node head2 = null;

        BuildList dataList = new BuildList();

        for (int num : data1) {
            head1 = dataList.insertEnd(num, head1);
        }

        for (int num : data2) {
            head2 = dataList.insertEnd(num, head2);
        }

        Node sumHead = addTwoNumbers(head1, head2);
        dataList.display(sumHead);

        sumHead = null;
        sumHead = addTwoNumbersFollowUp(head1, head2);
        dataList.display(sumHead);
    }

    // Without reversing
    private static Node addTwoNumbers(Node l1, Node l2) {
        Node sumList = new Node ();
        Node head = sumList;
        int remainder = 0;
        
        while (l1 != null || l2 != null) {
            int value1 = l1 != null ? l1.data : 0;
            int value2 = l2 != null ? l2.data : 0;
            int sum = value1 + value2 + remainder;
            head.next = new Node (sum % 10);
            head = head.next;
            remainder = sum / 10;
            
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if (remainder != 0) {
            head.next = new Node (remainder);
        }
        
        return sumList.next;
    }

    // Follow up
    private static Node addTwoNumbersFollowUp(Node l1, Node l2) {
        Stack <Integer> number1 = new Stack <>();
        Stack <Integer> number2 = new Stack <>();
        
        Node temp1 = l1;
        Node temp2 = l2;
        
        while (temp1 != null || temp2 != null) {
            if (temp1 != null) {
                number1.push (temp1.data); 
                temp1 = temp1.next;
            }
            
            if (temp2 != null) {
                number2.push (temp2.data);
                temp2 = temp2.next;
            }
        }  
        
        int carry = 0;
        Node sumList = new Node();
        Node head = sumList;
        
        Stack <Integer> sumStack = new Stack <>();
        
        while (!number1.isEmpty() || !number2.isEmpty()) {
            int value1 = number1.isEmpty() ? 0 : number1.pop();
            int value2 = number2.isEmpty() ? 0 : number2.pop();
            
            int sum = carry + value1 + value2;
            carry = sum / 10;
            
            sumStack.push (sum % 10);
        }
        
        if (carry != 0) {
            sumStack.push (carry);
        }
        
        while (!sumStack.isEmpty()) {
            head.next = new Node (sumStack.pop());
            head = head.next;
        }
        
        return sumList.next;
    }
}