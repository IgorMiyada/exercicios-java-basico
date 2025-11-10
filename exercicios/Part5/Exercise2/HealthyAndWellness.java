package Part5.Exercise2;

public class HealthyAndWellness extends Products implements Tributacao {

    public HealthyAndWellness(String name, double price) {
        super(name, price);
    }

    @Override
    public double getTaxValue() {
        return super.getPrice() * 0.015;
    }
}
