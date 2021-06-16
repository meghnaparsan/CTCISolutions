// Write code to remove duplicates from an unsorted linked list

import java.util.HashSet;

import Utils.BuildList;
import Utils.Node;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] data = { 10, 2, 3, 10, 3, 2, 1 };

        Node head = null;
        BuildList dataList = new BuildList();

        for (int num : data) {
            head = dataList.insertFront(num, head);
        }

        System.out.println("Removed duplicates without using any external space");
        Node temp = removeDuplicatesWithoutBuffer(head);
        dataList.display(temp);

        System.out.println("Removed duplicates using external space");
        temp = removeDuplicates(head);
        dataList.display(temp);
    }

    // With Buffer
    private static Node removeDuplicates(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node temp = head;
        Node previous = null;

        while (temp != null) {
            if (set.contains(temp.data)) {
                previous.next = temp.next;
                // temp = previous.next;
            }

            else {
                set.add(temp.data);
                previous = temp;
            }

            temp = temp.next;
        }

        return head;
    }

    // Without Buffer
    private static Node removeDuplicatesWithoutBuffer(Node head) {
        Node current = head;

        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                }

                else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }

        return head;
    }
}
