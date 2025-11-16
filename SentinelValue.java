
package sentinelvalue;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
        System.out.println(" please enter your vlue ");
        int data=0;
        int sum=0;
        while (data !=8){
        sum +=data;
            System.out.println(" enter your (the input ends if it is )(0)  ");
             data=input.nextInt();
        }
            System.out.println(" this sum is "+sum);
    }
    
}
