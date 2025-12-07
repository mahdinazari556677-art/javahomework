
package acceleration;

import java.util.Scanner;

public class Acceleration {

    public static void main(String[] args) { 
  Scanner input=new
    Scanner (System.in);  
        System.out.println("enter ");
        double v1=input.nextDouble();
           double v2=input.nextDouble();
                double t=input.nextDouble();
                double a=(v2-v1)/t;
                System.out.println(" the a aqalse "+a);
}
}