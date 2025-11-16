
package revisinglattery;

import java.util.Scanner;

public class RevisingLattery {

    public static void main(String[] args) {
       String lottery=""+(int )(Math.random())*10+(int)(Math.random())*10; 
               System.out.println("enter your Lorrery two Digit ");
        Scanner input =new Scanner (System.in);
        String guess=input.nextLine();
        
        char lotterydigit1=lottery.charAt(0);
        char lotterydigit2=lottery.charAt(1);
        
        char guessdigit1=guess.charAt(0);
        char guessdigit2=guess.charAt(1);
        
        System.out.println("your lottery number is"+lottery);
        if (lottery.equals(guess));{
            System.out.println("you win $10000");}
        if (( guessdigit1==lotterydigit2)||
            ( guessdigit2== lotterydigit1)){
            System.out.println("you win $3000");}
        
        if ((guessdigit1==lotterydigit1)||
            (guessdigit1==lotterydigit2)||
            (guessdigit2==lotterydigit1)||
            (guessdigit2==lotterydigit2)) {
            System.out.println("you win $1000");
        } 
      
    }
    
}
