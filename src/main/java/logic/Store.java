package logic;

import java.util.Hashtable;

public class Store {
    private Hashtable<ItemDecorator, Integer> collection;

    public Store() {
        this.collection = new Hashtable<>();
    }

    public Hashtable<ItemDecorator, Integer> getCollection() {
        return collection;
    }

    public void setCollection(Hashtable<ItemDecorator, Integer> coll) {
        this.collection = coll;
    }

    public int search(ItemDecorator itemDecorator) {
        // Returns the amount of flowers found in collection
        if (!collection.containsKey(itemDecorator)) {
            return 0;
        }
        return collection.get(itemDecorator);
    }

    public void add(ItemDecorator itemDecorator, int amount) {
        if (!collection.containsKey(itemDecorator)) {
            collection.put(itemDecorator, amount);
        } else {
            collection.put(itemDecorator, collection.get(itemDecorator) + amount);
        }
    }
}
