package pl.devfoundry.testing.order;

import pl.devfoundry.testing.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private OrderStatus orderStatus;
    private List<Meal> meals = new ArrayList<>();

    public void addMealToOrder(Meal meal) {
        this.meals.add(meal);
    }

    public void removeMeaFromOrder(Meal meal) {
        this.meals.remove(meal);
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public void cancel() {
        this.meals.clear();
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    int totalPrice() {

        int sum = this.meals.stream()
                .mapToInt(Meal::getPrice)
                .sum();

        if (sum < 0) {
            throw new IllegalStateException("Price limit exceeded");
        } else {
            return sum;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "meals=" + meals +
                '}';
    }
}
