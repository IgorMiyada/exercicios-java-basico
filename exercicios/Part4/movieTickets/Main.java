package Part4.movieTickets;

public class Main {
    public static void main(String[] args) {

        MovieTicket movieTicket = new MovieTicket("Senhor dos anéis", "dubbed");
        MovieTicket movieTicket1 = new FamilyTicket("Meu malvado favorito 3", "dubbed", 4);
        MovieTicket movieTicket2 = new StudentTicket("Demons Slayer", "subtitled");

        printMovie(movieTicket);
        printMovie(movieTicket1);
        printMovie(movieTicket2);

    }

    public static void printMovie(MovieTicket movieTicket){
        if(movieTicket instanceof  FamilyTicket familyTicket){
            System.out.printf("""
                    Movie name : %s
                    Audio Type : %s
                    Price : %.2f
                    Quantity : %d
                    """,familyTicket.getMovieName(),
                    familyTicket.getDubbedOrSubtitled(),
                    familyTicket.getValue(),
                    familyTicket.getQuantity()
            );
        }else {
            System.out.printf("""
                    Movie name : %s
                    audio Type : %s
                    Price : %.2f
                    """,movieTicket.getMovieName(),
                    movieTicket.getDubbedOrSubtitled(),
                    movieTicket.getValue()
            );

        }
    }
}
