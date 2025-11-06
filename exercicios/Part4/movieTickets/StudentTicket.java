package Part4.movieTickets;

public class StudentTicket extends MovieTicket{

    public StudentTicket(String movieName, String dubbedOrSubbed) {
        super(movieName, dubbedOrSubbed);
    }

    @Override
    public double getValue() {
        return super.getValue()*0.5;
    }
}
