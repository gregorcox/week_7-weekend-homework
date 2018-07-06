public class DrumSticks extends Accessory implements ISell {

    public DrumSticks(double costPrice, double sellPrice){
        super(costPrice, sellPrice);
    }

    public double calculateMarkup(){
        return sellPrice - costPrice;
    }
}
