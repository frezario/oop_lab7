package logic;

public class BasketDecorator extends ItemDecorator {

    @Override
    double price() {
        return 4;
    }

    @Override
    public String getDescription() {
        return "Basket: 4 UAH";
    }
}
