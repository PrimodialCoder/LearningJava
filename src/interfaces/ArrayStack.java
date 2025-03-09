package interfaces;

public class ArrayStack implements Stack{

    int[] stack = new int[10];
    int pointer = 0;
    ArrayStack(int size) {
        stack = new int[size];
        pointer = 0;
    }
    @Override
    public void push(Integer o) {
        System.out.println("pushing " + o + " to the array stack");
        stack[pointer++] = o;
    }
    public void pop() {
        System.out.println("popping" + stack[pointer] + " from the array stack");
        pointer--;
    }

    public Integer peek() {
        System.out.println("peeking " + stack[pointer] + " from the array stack");
        return stack[pointer-1];
    }
}
