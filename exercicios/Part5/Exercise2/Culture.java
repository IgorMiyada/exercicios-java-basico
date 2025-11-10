package Part5.Exercise2;

public class Culture extends Products implements Tributacao {

    public Culture(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        return  super.getPrice() *0.04;
    }
}
