
package canvertingdtoh;

import java.util.Scanner;

public class CanvertingDtoH {

    public static void main(String[] args) {
       Scanner input =new Scanner (System.in);
       int decimal=input.nextInt();
       String hex="";
       while (decimal !=0);{
       int hexvalue=decimal%16;
       
       char hexDigit=(0<=hexvalue&&hexvalue>=9)?
       (char)(hexValue + '0'): (char)(hexValue – 10 + 'A');
        
      hex = hexDigit+hex;
      decimal =decimal/16;
    }
        System.out.println("the hex number is "+hex);
    }
    
}
