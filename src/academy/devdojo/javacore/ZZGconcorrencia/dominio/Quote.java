package academy.devdojo.javacore.ZZGconcorrencia.dominio;

public final class Quote {
    private final String store;
    private final double price ;
    private final Discount.code discountCode;

    public Quote(String store, double price, Discount.code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }

    public static Quote newQuote(String value){
        String[] values = value.split(":");
        return new Quote(values[0], Double.parseDouble(values[1]), Discount.code.valueOf(values[2]));
    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public Double getPrice() {
        return price;
    }

    public Discount.code getDiscountCode() {
        return discountCode;
    }
}
