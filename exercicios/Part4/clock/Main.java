package Part4.clock;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try{
            Clock brClock = new BrazilianClock(14,8,45);
            Clock americanClock = new USClock(1,16,20,false);
            System.out.println(brClock.getFormattedTime());
            System.out.println(americanClock.getFormattedTime());
            brClock.updateClock(americanClock);
            //americanClock.updateClock(brClock);
            System.out.println(brClock.getFormattedTime());
        }catch(RuntimeException error){
            System.out.println(error.getMessage());
        }

    }
}
