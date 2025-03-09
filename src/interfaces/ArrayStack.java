package interfaces;

public class ArrayStack implements Stack{
    @Override
    public void push(Integer o) {
        System.out.println("pushing " + o + " to the array stack");
    }
    public void pop() {
        System.out.println("popping from the array stack");
    }

    public Integer peek() {
        System.out.println("peeking from the array stack");
        return 0;
    }
}
