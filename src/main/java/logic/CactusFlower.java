package logic;

public class CactusFlower extends Item {

    public CactusFlower() {
        description = "Cactus: 800 UAH";
    }

    @Override
    public double price() {
        return 800;
    }
}
