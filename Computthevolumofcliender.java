
package computthevolumofcliender;

import java.util.Scanner;

public class Computthevolumofcliender {

    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
        System.out.println("    pleas enter radis and lenght ");
        double r=input.nextDouble();
        double l=input.nextDouble();
        
        double  erea =r*r*Math.PI;
        double  volume =erea*l;
        System.out.println("the erea "+erea);
        System.out.println("the volume "+volume);
    }
    
}
