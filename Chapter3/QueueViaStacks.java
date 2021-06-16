import java.util.Stack;

public class QueueViaStacks {
    public static void main (String [] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push (10);
        myQueue.push (20);
        myQueue.push (100);
        myQueue.push (200);
        myQueue.push (1);
        myQueue.push (2);

        System.out.println ("Top Element: " + myQueue.pop());
        System.out.println ("Top Element: " + myQueue.pop());        
    }   
}

class MyQueue {
    Stack <Integer> queueStack;
    Stack <Integer> auxStack;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        queueStack = new Stack <>();
        auxStack = new Stack <>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        queueStack.push (x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return auxStack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        
        if (auxStack.isEmpty()) {
            while (!queueStack.isEmpty()) {
                auxStack.push (queueStack.pop());
            }
        }
        
        return auxStack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return auxStack.isEmpty() && queueStack.isEmpty();
    }
}
