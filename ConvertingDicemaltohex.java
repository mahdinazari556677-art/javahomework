
package convertingdicemaltohex;

import java.util.Scanner;

public class ConvertingDicemaltohex {

    public static void main(String[] args) {
       Scanner  input =new Scanner (System.in);
        System.out.println("Enter youtr dicemal ");
       int dicemal=input.nextInt();
       
       String hex="";
       while (dicemal!=0);{
       int hexvalue =dicemal%16;
       
       char hexdigit =(hexvalue<=9&&hexvalue>=0)?
      (char) (hexvalue +'0'):(char)(hexvalue -10+'A');
     hex=hexdigit+hex;
       dicemal=dicemal/16;}
      System.out.println("the hex number is "+hex);                                                                                          
      
    }
}
