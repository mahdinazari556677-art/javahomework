
package computinglong;

import java.util.Scanner;

public class ComputingLong {

    public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
        System.out.println("please enter you years");   
        double years=input.nextDouble();
        
        System.out.println("please enter you rate ");
        double rate=input.nextDouble();
        
        System.out.println("please enter you amount ");
        double amount =input.nextDouble();
        double monthlypayment = amount*rate/(1-1/Math.pow(1+rate,years+12));
        double totalpayment=(monthlypayment*12*years);
     System.out.println("The monthly payment is $" +
 (int)(monthlypayment * 100) / 100.0);
 System.out.println("The total payment is $" +
 (int)(totalpayment * 100) / 100.0);

                
    }
    
}
