public class Time {
    public static int hour;
    public static int minute;
    public static int seconds;
    public String hr;
    public String mn;
    public String sc;
    public boolean AM = false;

    public Time(int h, int m, int s){
        this.hour = h;
        this.minute = m;
        this.seconds = s;
    }

    public void check(){
       if(seconds > 59){
           seconds = seconds % 60;
           minute++;
       }
       if(minute > 59){
           minute %= 60;
           hour++;
       }
       if(hour > 24){
           hour %= 24;
       }
    }

    public void addzero(){
        if (hour < 10){hr = "0" + hour;}
        else {hr = "" + hour;}
        if (minute < 10){mn ="0" + minute;}
        else {mn = ""+minute;}
        if (seconds < 10){sc = "0"+seconds;}
        else {sc = ""+seconds;}
    }

    public String toUni(){
        check();
        addzero();
        return "'" + hr +":" + mn + ":" + sc + "'";
    }

    public String toStand(){
        check();
        String res = null;
        if(hour > 12){
            hour %= 12;
            addzero();
            res = "'" + hr +":" + mn + ":" + sc + "PM'";
        }
        else if(hour == 12){
            addzero();
            res = "'" + hr +":" + mn + ":" + sc + "PM'";
        }
        else if(hour < 12){
            addzero();
            res = "'" + hr +":" + mn + ":" + sc + "AM'";
            AM = true;
        }
        return res;
    }
    public void add(Time t2)
    {
        if (!AM == true) { // if PM
            this.hour += 12;
            this.hour += t2.hour;
            this.hour += t2.minute;
            this.seconds += t2.seconds;
        }
        else
        {
            this.hour += t2.hour; // if AM
            this.minute += t2.minute;
            this.seconds+= t2.seconds;
        }
    }
    public static void main(String[] args){
        Time t = new Time(13, 9, 12);
        System.out.println(t.toStand());
        System.out.println(t.toUni());

        Time t2 = new Time(12, 3, 45);
        t.add(t2);
        System.out.println(t.toStand());
        System.out.println(t.toUni());

    }

}
