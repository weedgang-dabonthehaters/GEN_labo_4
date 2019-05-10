package ch.heigvd.gen2019;

public class Amount {
    private double price;
    private String currency;

    public Amount(double price, String currency){
        this.price = price;
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
