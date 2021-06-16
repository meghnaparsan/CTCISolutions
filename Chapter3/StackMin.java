// Design a Stack which, in addition to push and pop, has a function min which returns the minimum element
import java.util.Stack;

public class StackMin {
    public static void main (String [] args) {
        MinStack minStack = new MinStack();
        minStack.push (100);
        minStack.push (18);
        minStack.push (3);
        minStack.push (4);
        minStack.push (5);
        minStack.push (1);

        System.out.println ("Minimum: " + minStack.getMin());

    }
}

class MinStack {
    
    Stack <Integer> allElements;
    Stack <Integer> minElements;
    
    public MinStack() {
        allElements = new Stack <>();
        minElements = new Stack <>();
    }
    
    public void push(int x) {
        if (minElements.isEmpty() || Integer.valueOf(minElements.peek()) >= x) {
            minElements.push (x);
        }
        
        allElements.push (x);
    }
    
    public void pop() {
        if (minElements.peek().equals (allElements.peek())) {
            minElements.pop();
        }
        
        allElements.pop();
    }
    
    public int top() {
        if (!allElements.isEmpty()) {
            return allElements.peek();
        }
        
        return -1;
    }
    
    public int getMin() {
        if (!minElements.isEmpty()) {
            return minElements.peek();
        }
        
        return -1;
    }
}
