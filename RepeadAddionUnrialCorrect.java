
package repeadaddionunrialcorrect;

import java.util.Scanner;

public class RepeadAddionUnrialCorrect {

    public static void main(String[] args) {
        int number1 =(int )(Math.random()*10);
         int number2 =(int )(Math.random()*10);
        Scanner input =new Scanner(System.in);
        System.out.println("what is "+number1+"+"+number2+"?");
        int answer=input.nextInt();
        while (answer !=number1+number2){
            
        
            System.out.println("try agin "+"what is "+number1+"+"+number2);
        answer=input.nextInt();}
        System.out.println("your corrct");
            
        
        
    }
}
