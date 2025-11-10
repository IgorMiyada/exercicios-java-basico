package Part5.Exercise2;

public class Food extends Products implements Tributacao {

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        return super.getPrice() * 0.01;
    }
}
