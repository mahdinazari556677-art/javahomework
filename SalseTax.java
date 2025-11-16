
package salse.tax;

import java.util.Scanner;

public class SalseTax {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Enter purchase Amount");
        double ph=input.nextDouble();
        double tax =ph*500.09;
        System.out.println("this is tax "+(int)(tax*100/100));
    }
    
}
