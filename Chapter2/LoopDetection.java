// Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.

import Utils.Node;

public class LoopDetection {
    public Node detectCycle(Node head) {
        if (head == null) {
            return null;
        }
        
        Node fast = head;
        Node slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow) {
                break;
            }
        }
        
        if (fast == null || fast.next == null) {
            return null;
        }
        
        Node start = head;
        
        while (start != slow) {
            start = start.next;
            slow = slow.next;
        }
        
        return start;
    }   
}