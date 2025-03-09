package interfaces;

public class QueueStack implements Stack {
    @Override
    public void push(Integer o) {
        System.out.println("pushing " + o + " to the queue stack");
    }
    public void pop() {
        System.out.println("popping from the queue stack");
    }

    public Integer peek() {
        System.out.println("peeking from the queue stack");
        return 0;
    }
}
