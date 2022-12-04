package academy.devdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueveTest01 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        bq.put("Gabriel");
        System.out.printf("%s Added the value %s%n", Thread.currentThread().getName(), bq.peek());
        System.out.println("Trying to add another value");
        new Thread(new RemoveFromQueve(bq)).start();
        bq.put("Silva");
        System.out.printf("%s Added the value %s%n", Thread.currentThread().getName(), bq.peek());
    }

    static class RemoveFromQueve implements Runnable{
        private final BlockingQueue<String>bq;

        public RemoveFromQueve(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s going to sleep for 2s %n", Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.printf("%s Added the value %s%n", Thread.currentThread().getName(), bq.take());
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}