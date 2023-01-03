package logic;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double sum = 0;
        for (Item item: items) {
            sum += item.price();
        }
        return sum;
    }

    public void processOrder() {
        // Some primitive order processing
        payment.pay(calculateTotalPrice());
        delivery.deliver(items);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        int index = items.indexOf(item);
        if (index != -1) {
            items.remove(item);
        }
    }

}
