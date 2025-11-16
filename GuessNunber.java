
package guessnunber;

import java.util.Scanner;

public class GuessNunber {

    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
        System.out.println("please enter guess");
        int guess=input.nextInt();
      int number=(int)(Math.random()*100);
      if (number==guess)
        System.out.println("yes the number is "+guess+"+"+number);
      else if(number >guess) {
            System.out.println("you guess is too low");}
      else
            System.out.println("you guess is too high");
      
     
             
      
    }
    
}
