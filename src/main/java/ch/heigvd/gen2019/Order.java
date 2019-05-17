package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProductAt(int index) {
        return products.get(index);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void getOrder(StringBuffer sb) {
        sb.append("{");
        sb.append("\"id\": ");
        sb.append(getOrderId());
        sb.append(", ");
        sb.append("\"products\": [");
        for (int j = 0; j < getProductsCount(); j++) {
            Product product = getProductAt(j);

            product.getProduct(sb);
        }

        if (getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]");
        sb.append("}, ");
    }
}
