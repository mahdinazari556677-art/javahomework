
package anadvancedmath;

import java.util.Scanner;

public class AnAdvancedMath {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      final int NUMBER =5;
      int correctCount=0;
      int count=0;
      while (count<NUMBER){
          int number1=(int)(Math.random());
           int number2=(int)(Math.random());
           
           if(number1<number2){
               int temp=number1;
               number1=number2;
               number2=temp;}
          System.out.println("what is "+number1+"-"+number2+"?");
          int answer=input.nextInt();
          if(answer==(number1-number2)){
              System.out.println("Correct!");
              correctCount++;}
          else{
              System.out.println("you got"+correctCount+"out of"+NUMBER+"correct");
              
          }
          }
      }
    }
    
}
