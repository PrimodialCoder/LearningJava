package interfaces;

public class LinkedStack implements Stack {
    @Override
    public void push(Integer o) {
        System.out.println("pushing " + o + " to the linked stack");
    }
    public void pop() {
        System.out.println("popping from the linked stack");
    }

    public Integer peek() {
        System.out.println("peeking from the linked stack");
        return 0;
    }

    @Override
    public void add(Integer o) {

    }

    @Override
    public void remove(Integer o) {

    }

    @Override
    public int size() {
        return 0;
    }
}
