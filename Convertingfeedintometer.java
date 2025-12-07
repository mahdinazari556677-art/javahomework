
package convertingfeedintometer;

import java.util.Scanner;

public class Convertingfeedintometer {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("please enter feed ");
        double  feed =input.nextDouble();
        double  meters =feed *0.305;
        System.out.println("the "+feed +"and "+meters );
    }
    
}
