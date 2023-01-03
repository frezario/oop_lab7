package logic;

public abstract class Item {
    public String description;


    public String getDescription() {
        return description;
    }

    abstract double price();
}
