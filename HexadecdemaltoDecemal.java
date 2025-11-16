
package hexadecdemaltodecemal;

import java.util.Scanner;

public class HexadecdemaltoDecemal {

    public static void main(String[] args) {
      Scanner input =new Scanner (System.in);
        System.out.println("please enter hexDigit");
        String hexString =input.nextLine();
        if (hexString.length() !=1){
            System.out.println("you most enter an character");
           System.exit(1);
           
        }
       char ch =hexString.charAt(0);
      
       if (ch>='A'&&ch<='F'){
           int value=ch-'A'+10;
           System.out.println("the dicemal value for hex Digit"+ch+"is"+ch);
           
       }
       else if(Character.isDigit(ch)){
           
            System.out.println("the dicemal value for hex Digit "+ch+"is "+ch);}
       else 
            System.out.println("is an in invalid input ");   
     
    } 
}
