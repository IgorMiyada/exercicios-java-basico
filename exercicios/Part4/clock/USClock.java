package Part4.clock;

public class USClock extends Clock{
    boolean isAm;

    public USClock(int hour, int minutes, int seconds, boolean isAm) {
        super(hour, minutes, seconds);
        this.isAm = isAm;
    }

    @Override
    public void setHour(int hour) {
        if(hour<0 || hour>12){
            throw new IllegalArgumentException("The American clock pattern only allown numbers between 0 and 12 hours");
        }
        super.setHour(hour);
    }

    @Override
    public void updateClock(Clock otherClock) {
        if(otherClock.getHour()>12){
            this.setHour(otherClock.getHour()-12);
            this.isAm = false;
        }
        else{
            this.setHour(otherClock.getHour());
        }
        this.setMinutes(otherClock.getMinutes());
        this.setSeconds(otherClock.getSeconds());
    }

    @Override
    public String getFormattedTime() {
        String amOrPm = isAm ? "AM" : "PM";
        return String.format("%d:%d:%d %s",this.getHour(),this.getMinutes(),this.getSeconds(),amOrPm);
    }

    public boolean isAm() {
        return isAm;
    }

    public void setAm(boolean am) {
        isAm = am;
    }

}
