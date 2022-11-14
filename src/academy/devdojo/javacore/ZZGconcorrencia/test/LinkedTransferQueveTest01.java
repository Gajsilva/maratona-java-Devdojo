package academy.devdojo.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTransferQueveTest01 {
    public static void main(String[] args) throws InterruptedException {
    //    ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("gabriel"));
        System.out.println(tq.offer("gabriel"));
        System.out.println(tq.offer("gabriel", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Dev");
        }
        System.out.println(tq.tryTransfer("Academy"));
        System.out.println(tq.tryTransfer("Academy", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.remainingCapacity());
    }
}
