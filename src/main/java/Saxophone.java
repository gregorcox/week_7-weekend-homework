public class Saxophone extends Instrument  {

    private int numberOfValves;

    public Saxophone(String material, String colour, InstrumentType type, double costPrice, double sellPrice, int numberOfValves){
        super(material, colour, type, costPrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves(){
        return numberOfValves;
    }
}
