package pl.devfoundry.testing;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Order> orders = new ArrayList<>();

    void addOrderToCart(Order order) {
        this.orders.add(order);
    }

    void cleanCart() {
        this.orders.clear();
    }

    void simulateLargeOrder() {

        for (int i = 0; i < 1000; i++) {
            Meal meal = new Meal(i % 10, "hamburger no ");
            Order order = new Order();
            order.addMealToOrder(meal);
            addOrderToCart(order);
        }
        System.out.println("Cart size: " + orders.size());
        cleanCart();

    }

}
