package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //ExecutorService is an interface
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 1; i<=100; i++) {
            NumberPrinter print100 = new NumberPrinter(i);
            executorService.execute(print100);
        }
    }
}
//fixed no extra threads are created
// in a cached extra thread can be created if and on if there are no ideal threads and there is a waiting task