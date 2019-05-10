package ch.heigvd.gen2019;

public class Product {
    public static final Size SIZE_NOT_APPLICABLE = null;
    private String code;

    private Color color;
    private Size size;
    private Amount amount;

    public Product(String code, Color color, Size size, Amount amount) {

        this.code = code;
        this.color = color;
        this.size = size;
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public String getColor() {
        return color.toString();
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return amount.getPrice();
    }

    public String getCurrency() {
        return amount.getCurrency();
    }

	public String getSizeFor() {
		
	    return size.toString();
	}
}