package Intro_to_MultiThreading;

public class Client {
    public static void main(String[] args) {
//        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        Thread t = new Thread(helloWorldPrinter);
//        t.start();
//        helloWorldPrinter.run();// this line will not execute a new thread, it will execute the code in the main thread
//        //because we are calling the run method directly not using the start method
//        System.out.println("Main is executing in " + Thread.currentThread().getName());
        for(int i = 1; i<=100; i++) {
            HelloWorldPrinter print100 = new HelloWorldPrinter(i);
            Thread t = new Thread(print100);
            t.start();

        }
        //observe the output when we run the projects many times
        //the output will be different each time we run the project
        // this is because the thread scheduler is responsible for scheduling the threads
        // one print statement is executed by the main thread and the other print statement is executed by the thread t
    }
}
