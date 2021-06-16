package Utils;

public class BuildList {
    public Node insertFront(int data, Node head) {
        Node newNode = new Node(data, null);

        if (head == null) {
            head = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    public Node insertEnd (int data, Node head) {
        Node newNode = new Node (data, null);

        if (head == null) {
            head = newNode;
        }

        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        return head;
    }

    public void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("\n");
    }
}
