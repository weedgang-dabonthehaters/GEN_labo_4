package ch.heigvd.gen2019;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrderAt(int index) {
        return orders.get(index);
    }

    public String getOrders() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        if(orders.size() > 0) {
            for (int i = 0; i < getOrdersCount(); i++) {
                Order order = getOrderAt(i);
                order.getOrder(sb);
            }

            if (getOrdersCount() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }
        }

        return sb.append("]}").toString();
    }
}
