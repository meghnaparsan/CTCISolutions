import java.util.Stack;

public class SortStack {
    public static void main (String [] args) {
        SortStackHelper sortStackHelper = new SortStackHelper();
        sortStackHelper.push (1);
        sortStackHelper.push (100);
        sortStackHelper.push (5);
        sortStackHelper.push (10);

        sortStackHelper.display();
    }
}

class SortStackHelper {
    Stack <Integer> sortedStack;
    Stack <Integer> temp;

    SortStackHelper () {
        sortedStack = new Stack <>();
        temp = new Stack <>();
    }

    void push (int data) {
        if (sortedStack.isEmpty() || Integer.valueOf(sortedStack.peek()) >= data) {
            sortedStack.push (data);
            return;
        }

        while (!sortedStack.isEmpty() && sortedStack.peek() < data) {
            temp.push (sortedStack.pop());
        }

        sortedStack.push (data);
        while (!temp.isEmpty()) {
            sortedStack.push (temp.pop());
        }
    }

    void display() {
        System.out.println (sortedStack);
    }
}
