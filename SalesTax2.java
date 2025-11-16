
package salestax;

import java.util.Scanner;

public class salestax{

    public static void main(String[] args) {
     Scanner input =new Scanner(System.in);
        System.out.println("please enter you price");
        double  price =input.nextDouble ();
       double  salestax=price*0.4; 
        System.out.println("you are sales tax "+salestax);       
    }
    
}
