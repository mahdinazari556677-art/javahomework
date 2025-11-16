
package lottery;

import java.util.Scanner;

public class Lottery{

    public static void main(String[] args) {
        int lottery=(int)(Math.random());
      Scanner input=new Scanner(System.in);
        System.out.println("Enter  your lotterypick two (digits):");
        int gusse =input.nextInt();
        
        
        int lotteryDigit1=lottery/10;
        int lotteryDigit2=lottery%10;
        
        int gusseDigit1=gusse/10;
        int gusseDigit2=gusse%10; 
        System.out.println("the lottery digit"+lottery);
        if(lottery==gusse)
            System.out.println("win you $10000");
        else if ((gusseDigit2==lotteryDigit1)||(gusseDigit1==lotteryDigit2))
            System.out.println("you win $3000");
        else if(( gusseDigit1==lotteryDigit1 )
              || (gusseDigit2==lotteryDigit2)         
                ||(gusseDigit1==lotteryDigit2)
                 ||(gusseDigit2==lotteryDigit1))
            System.out.println("you win $1000");
        else
            System.out.println("you note win");
            }
    
}
