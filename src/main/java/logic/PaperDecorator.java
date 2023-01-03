package logic;

public class PaperDecorator extends ItemDecorator {

    public double price() {
        return 13;
    }

    @Override
    public String getDescription() {
        return "Paper: 13 UAH";
    }
}
