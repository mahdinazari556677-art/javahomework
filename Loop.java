
package loop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
Scanner input =new Scanner(System.in);
        System.out.println("Enther to number");
        int num =input.nextInt();
        int num1=((int)Math.random()*10);
         int num2=((int)Math.random()*10);
         
         int correct Result = num1+num2;
         System.out.println("what is "+num1+"+"+num2+"?");
         
         if(correct Result==userResult){
        System.out.println("the answer is correct not correct");
    }

      }
    }
    

