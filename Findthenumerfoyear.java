
package findthenumerfoyear;

import java.util.Scanner;

public class Findthenumerfoyear {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("enter the number of minut");
        long minutes=input.nextLong();
        
        long minutesoneyear=(365*24*60);
        long year =minutes/(minutesoneyear);
        long remanminutes=minutes%minutesoneyear;
        long day=minutesoneyear/144;
        System.out.println(minutes+"minutes is approx"+year+"eee"+day);
    }
    
}
