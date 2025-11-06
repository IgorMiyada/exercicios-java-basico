package Part4.movieTickets;

public class FamilyTicket extends MovieTicket{

    private int quantity;

    public FamilyTicket(String movieName, String dubbedOrSubbed, int quantity) {
        super(movieName, dubbedOrSubbed);
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return this.quantity > 3 ? (super.getValue()*this.quantity)*0.95 : (super.getValue()*this.quantity);
    }

    public int getQuantity() {
        return quantity;
    }
}
