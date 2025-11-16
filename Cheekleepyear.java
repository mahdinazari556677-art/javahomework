
package cheekleepyear;
import java.util.Scanner;
public class Cheekleepyear {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("plasae enter year");
    int year=input.nextInt();
    if((year%4==0&&year%100!=0)||(year%400==0));
        System.out.println("this year is leap year");}{
      
        System.out.println("this is not a leap year");
    }
    }

