
package evennumber;

import java.util.Scanner;

public class Evennumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("plase enter  namber");
        int i=input.nextInt();
     int x= 4;
     if (x%2==0){
         if (x !=0){
             System.out.println("Ev");
     }

     else{
         System.out.println("zero");
     }
    }
     else{
         System.out.println("odd");
     }
         
    }
}