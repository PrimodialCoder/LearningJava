package interfaces;

public class client{
    public static void main(String[] args) {

        // Stack stack = new Stack; // we cannot create object for the interface
        Stack sArray = new ArrayStack();
        Stack sLinked = new LinkedStack();
        Stack sQueue = new QueueStack();

        sArray.push(1);
        sLinked.push(2);
        sQueue.push(3);
        sArray.pop();
        sLinked.pop();
        sQueue.pop();
        sArray.peek();
        sLinked.peek();
        sQueue.peek();
    }
}
