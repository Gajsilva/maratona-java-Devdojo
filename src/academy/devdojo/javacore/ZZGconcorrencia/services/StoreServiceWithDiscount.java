package academy.devdojo.javacore.ZZGconcorrencia.services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    public double getPriceSync(String storeName){
        return priceGenerator();
    }

    private double priceGenerator(){

        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}