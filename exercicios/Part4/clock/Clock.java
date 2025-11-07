package Part4.clock;

public abstract class Clock {
    private int hour;
    private int minutes;
    private int seconds;

    public Clock(int hour, int minutes, int seconds) {
        setHour(hour);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public abstract void updateClock(Clock otherClock);

    public String getFormattedTime(){
        return String.format("%d:%d:%d",hour,minutes,seconds);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if((hour > 23 || hour<0) ){
            throw new IllegalArgumentException("The hour field only allow numbers between 0 and 23");
        }
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if((minutes > 59 || minutes < 0)){
            throw new IllegalArgumentException("The minutes field only allow numbers between 0 and 59");
        }
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(( seconds >60 || seconds < 0)){
            throw new IllegalArgumentException("The seconds field only allow numbers between 0 and 60");
        }
        this.seconds = seconds;
    }


}
