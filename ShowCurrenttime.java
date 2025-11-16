
package show.currenttime;
public class ShowCurrenttime {

    public static void main(String[] args) {
     long totalMillisecond=System.currentTimeMillis();
     long totalsecond=totalMillisecond/1000;
     long currentSecond=totalsecond%60;
     long totalMinutes=totalsecond/60;
     long currentMiniute=totalMinutes%60;
     long totalHours=totalMinutes/60;
     long currentHour=totalHours%24;
     long totalday=totalHours/4;
        String currentMinute;
     System.out.println("Current time is " + currentHour + ":"
 + currentMinutes + ":" + currentSecond + " GMT");
    }
    
}
