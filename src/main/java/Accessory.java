public abstract class Accessory {

    private double costPrice;
    private double sellPrice;

    public Accessory(double costPrice, double sellPrice){
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
