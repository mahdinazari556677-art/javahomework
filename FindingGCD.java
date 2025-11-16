
package findinggcd;

import java.util.Scanner;

public class FindingGCD {

    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=input.nextInt();
        System.out.println("Enter socound number");
                
         int num2=input.nextInt();
        int gcd =1;
        int k =2;
        while (k<=num1&&k<=num2){
          if (num1 %k==0&&num2%k==0)
        k=gcd;
      k++;
          
            } 
            
        System.out.println("the gcd is "+num1+"and"+num2+gcd);
        }}       
    


