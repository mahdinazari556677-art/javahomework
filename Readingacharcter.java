
package readingacharcter;

import java.util.Scanner;

public class Readingacharcter {

    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println("Enter a character");
        String s =input.nextLine();
        char ch =s.charAt(0);
        System.out.println("the charcter enter is "+ch);
        
    }
    
}
