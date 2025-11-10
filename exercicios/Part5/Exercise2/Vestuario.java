package Part5.Exercise2;

public class Vestuario extends Products implements Tributacao {

    public Vestuario(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        return super.getPrice() * 0.025;
    }
}
