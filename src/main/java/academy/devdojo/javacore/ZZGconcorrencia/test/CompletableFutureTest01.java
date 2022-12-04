package academy.devdojo.javacore.ZZGconcorrencia.test;

import academy.devdojo.javacore.ZZGconcorrencia.services.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        //searchPriceSync(storeService);
        //searchPriceAsyncFuture(storeService);
        searchPriceAsyncComplebleFuture(storeService);
    }

    private static void searchPriceSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrices Sync %d%n", (end-start));
    }

    private static void searchPriceAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        Future<Double> store1 = storeService.getPriceAsyncFuture("Store 1");
        Future<Double> store2 = storeService.getPriceAsyncFuture("Store 2");
        Future<Double> store3 = storeService.getPriceAsyncFuture("Store 3");
        Future<Double> store4 = storeService.getPriceAsyncFuture("Store 4");
        try {
            System.out.println(store1.get());
            System.out.println(store2.get());
            System.out.println(store3.get());
            System.out.println(store4.get());
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriuceSync %d%n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPriceAsyncComplebleFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        CompletableFuture<Double> store1 = storeService.getPriceAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> store2 = storeService.getPriceAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> store3 = storeService.getPriceAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> store4 = storeService.getPriceAsyncCompletableFuture("Store 4");

            System.out.println(store1.join());
            System.out.println(store2.join());
            System.out.println(store3.join());
            System.out.println(store4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriuceSync %d%n", (end-start));
    }
}
