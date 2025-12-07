
package financialapplication;

import java.util.Scanner;

public class Financialapplication {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("enter subtotal and rate ");
      double subtotal=input.nextDouble();
        double Rate =input.nextDouble();
        
        double gratuity= subtotal *(Rate /100);
        double total =subtotal+gratuity;
        
        System.out.println(""+gratuity+"sdkji"+total);
    }
    
}
