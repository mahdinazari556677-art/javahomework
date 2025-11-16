
package leapyear;

import java.util.Scanner;

public class Leapyear {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("enter your year ");
      int year =input.nextInt();
      if ((year%100!=0&&year%4==0)||(year%400==0))
            System.out.println("this  is leap year ");
      else 
            System.out.println("this is not leap year ");
    }
    
}
