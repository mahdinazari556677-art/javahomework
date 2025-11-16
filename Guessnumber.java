
package guessnumber;

import java.util.Scanner;

public class Guessnumber {

    public static void main(String[] args) {
        int number=(int)(Math.random()*101);
        Scanner input=new Scanner(System.in);
        System.out.println("guess s migic numbet betwen 0 and 100");
        
        int guess=-1;
        while (guess != number){
            System.out.println("enter your guess");
       
            System.out.println("yes the number is"+number);
        if(guess>number)
            System.out.println("you number is too high");
        if(guess<number)
            System.out.println("you number is low");
        }
        
        
    }
    
}
