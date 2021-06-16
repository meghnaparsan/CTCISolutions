// Given two singly linked lists, determine if the two lists intersect.

import Utils.Node;

public class Intersection {
    public Node getIntersectionNode(Node headA, Node headB) {
        Node pointerA = headA;
        Node pointerB = headB;
        
        while (pointerA != null || pointerB != null) {
            if (pointerA == pointerB) {
                return pointerA;
            }
            
            if (pointerA != null) {
                pointerA = pointerA.next;
            }
            
            else {
                pointerA = headB;
            }
            
            if (pointerB != null) {
                pointerB = pointerB.next;
            }
            
            else {
                pointerB = headA;
            }
        }
        
        return null;
    }
}
