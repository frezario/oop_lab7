package logic;

public class FlowerPack {
    private final ItemDecorator itemDecorator;
    private final int quantity;
    public FlowerPack(ItemDecorator itemDecorator, int quantity) {
        this.itemDecorator = itemDecorator;
        this.quantity = quantity;
    }

    public double getPrice() {
        return itemDecorator.price() * quantity;
    }
}
