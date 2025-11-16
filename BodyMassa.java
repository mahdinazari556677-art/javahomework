]\
package bodymassa;

import java.util.Scanner;

public class BodyMassa {

    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      
        System.out.println("please enter weight");
        double weight=input.nextInt();
        
        System.out.println(" please enter height");
        double height=input.nextInt();
         final double kilogram=0.4535;
         final double meter=0.0254;
         
         double  weightkilogram=weight*kilogram;
         double  heightmeter=height*meter;
         double  bmi= weightkilogram/heightmeter*heightmeter;
         System.out.println("BMI"+bmi);
         if (bmi<18.5)
             System.out.println("under weight ");
         else  if (bmi<25)
              System.out.println("normal");
         else if  (bmi<30)
              System.out.println("overweight");
         else
             System.out.println("obese");
          
         
    }
    
}
