
package monetrayunits1;

import java.util.Scanner;

public class MonetrayUnits1 {

    public static void main(String[] args) {
          Scanner input =new Scanner (System.in);
      double amount =input.nextDouble();
        System.out.println("enter amount a double for exemple 44.3");
   
int Amount =(int)(amount*100); 
int onedollar=Amount/100;
Amount =Amount%100;

int Quarter =Amount /25;
 Amount =Amount%25;
 
 int Dicem=Amount /10;
 Amount =Amount %10;
 
 int Nical=Amount /5;
 Amount=Amount %5;
int pennies=Amount ;
        System.out.println("your amount "+amount );
        System.out.println("your dollar is"+onedollar );
        System.out.println("your Quarter is"+Quarter);
        System.out.println("your Dicem is"+Dicem);
        System.out.println("your Nical is"+Nical);
        System.out.println("your pennies is "+pennies);
   
    }
    
}
