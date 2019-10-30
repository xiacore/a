package demoday;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class thead3 {

    public static void main(String[] args) {

        thead t =new thead();
        FutureTask<Integer> futureTask1 = new FutureTask<>(t);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(futureTask1);
        new Thread(futureTask1).start();
        try {
            System.out.println(futureTask1.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }



    }
}
