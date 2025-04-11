package objectorienteddesignprinciples.product;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orderHistory;

    public Customer(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public String getName() { return name; }

    public void placeOrder(Order order) {
        orderHistory.add(order);
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }
}

