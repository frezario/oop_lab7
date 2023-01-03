package logic;

import java.util.ArrayList;
import java.util.Objects;

public class FlowerBucket extends Item {
    private final ArrayList<Item> items;

    public FlowerBucket() {
        this.items = new ArrayList<Item>();
    }

    public void addFlowers(Item item) {
        items.add(item);
    }

    public int searchFlower(Item flower) {
        int idx = 0;
        for (Item item: items) {
            if (Objects.equals(item.description, flower.description)) {
                return idx;
            }
            idx++;
        }
        return idx;
    }

    @Override
    public double price() {
        double sum = 0;
        for (Item pack: items) {
            sum += pack.price();
        }
        return sum;
    }
}
