package academy.devdojo.javacore.ZZGconcorrencia.services;

import academy.devdojo.javacore.ZZGconcorrencia.dominio.Discount;
import academy.devdojo.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    public String getPriceSync(String storeName){
        double price = priceGenerator();
        Discount.code discountCode = Discount.code.values()
                [ThreadLocalRandom.current().nextInt(Discount.code.values().length)];
        return String.format("%s:%.2f:%s", storeName,price,discountCode);
    }

    public String applyDiscount (Quote quote){
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPorcentage()) / 100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountValue);
    }


    private double priceGenerator(){

        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.SECONDS.sleep(milli);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
