package interfaces;

public class client{
    public static void main(String[] args) {

        // Stack stack = new Stack; // we cannot create object for the interface
//        Stack stack = new LinkedStack();// we just have to change the object creation to change the implementation mode
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.pop();
//        stack.peek();
//        stack.push(4);
//        stack.pop();
        Stack stack = new ArrayStack(15);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.peek();
    }
}
