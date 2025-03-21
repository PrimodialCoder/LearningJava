package Intro_to_MultiThreading;

public class HelloWorldPrinter implements Runnable {
    public int i;
    public HelloWorldPrinter(int i) {
        this.i = i;
    }
    void print() {
        System.out.println(i+ " --- " +Thread.currentThread().getName() + "\n");
    }

    @Override
    public void run() {
        print();
    }
}
//runnable interface has a method called run
//this run method is called by the thread internally to execute the code
//whatever is written in the run method will be executed by the thread