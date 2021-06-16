// Implement an algorithm to find the kth to last element of a singly linked list
import Utils.BuildList;
import Utils.Node;

public class KthToLastNode {
    public static void main (String [] args) {
        int[] data = { 10, 2, 3, 10, 3, 2, 1 };

        Node head = null;
        BuildList dataList = new BuildList();

        for (int num : data) {
            head = dataList.insertFront(num, head);
        }

        int k = 3;

        Node kthNode = findKthNode (head, k);
        System.out.println ("Value: " + kthNode.data);
    }

    private static Node findKthNode (Node head, int k) {
        Node temp = head;

        for (int index = 0; index < k; index++) {
            if (temp == null) {
                return null;
            }

            temp = temp.next;
        }

        Node temp2 = head;

        while (temp != null) {
            temp = temp.next;
            temp2 = temp2.next;
        }

        return temp2;
    }
}
