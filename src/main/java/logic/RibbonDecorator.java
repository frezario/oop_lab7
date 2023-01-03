package logic;

public class RibbonDecorator extends ItemDecorator {
    @Override
    double price() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Ribbon: 40 UAH";
    }
}
