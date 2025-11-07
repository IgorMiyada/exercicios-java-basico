package Part4.clock;

public class BrazilianClock extends Clock{
    public BrazilianClock(int hour, int minutes, int seconds) {
        super(hour, minutes, seconds);
    }


    @Override
    public void updateClock(Clock otherClock) {
        if(otherClock instanceof USClock){
            if(((USClock) otherClock).isAm()){
                this.setHour(otherClock.getHour());
            }
            else{
                this.setHour(otherClock.getHour()+12);
            }
        }else{
            this.setHour(otherClock.getHour());
        }
        this.setMinutes(otherClock.getMinutes());
        this.setSeconds(otherClock.getSeconds());
    }
}
