package academy.devdojo.javacore.ZZGconcorrencia.test;

import academy.devdojo.javacore.ZZGconcorrencia.services.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceAsyncComplebleFuture(storeService);
    }
    private static void searchPriceAsyncComplebleFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2","Store 3","Store 4");

        List<CompletableFuture<Double>> collect = stores.stream()
                .map(storeService::getPriceAsyncCompletableFuture)
                .collect(Collectors.toList());
        List<Double> price = collect.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(price);
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriuceSync %d%n", (end-start));
    }
}
