// Write code to partition a linked list around a value x, such that all nodes less than x comes before all nodes greater than or equal to x

import Utils.BuildList;
import Utils.Node;

class PartitionList {
    public static void main(String[] args) {
        int[] data = { 1, 4, 3, 2, 5, 2 };

        Node head = null;
        BuildList dataList = new BuildList();

        for (int num : data) {
            head = dataList.insertEnd(num, head);
        }

        int x = 3;
        Node partitionHead = partition (head, x);
        dataList.display(partitionHead);
    }

    private static Node partition(Node head, int x) {
        Node lesserList = new Node();
        Node greaterList = new Node();
        Node current = head;
        Node lesserHead = lesserList;
        Node greaterHead = greaterList;
        
        while (current != null) {
            if (current.data < x) {
                lesserHead.next = current;
                lesserHead = lesserHead.next;
            }
            
            else {
                greaterHead.next = current;
                greaterHead = greaterHead.next;
            }
            
            current = current.next;
        }
        
        greaterHead.next = null;
        lesserHead.next = greaterList.next;
        return lesserList.next;
    }
}