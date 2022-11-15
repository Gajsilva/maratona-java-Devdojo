package academy.devdojo.javacore.ZZGconcorrencia.dominio;

public final class Quote {
    private final String store;
    private final Double price ;
    private final Discount.code discountCode;

    public Quote(String store, Double price, Discount.code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    private static Quote newQuote(String value){

    }
}
