package Part4.movieTickets;

public class MovieTicket {
    static final double value = 28;
    private String movieName;
    private String dubbedOrSubtitled;

    public MovieTicket(String movieName, String dubbedOrSubbed) {
        this.movieName = movieName;
        this.dubbedOrSubtitled = dubbedOrSubbed;
    }

    public double getValue() {
        return value;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getDubbedOrSubtitled() {
        return dubbedOrSubtitled;
    }
}
