/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gusse;

import java.util.Scanner;

public class Gusse {

    public static void main(String[] args) {
       Scanner input = new Scanner( System.in);
       int num =(int) (Math.random()*100);int gusse =-2;int c=0;
       
       while( num!=gusse){
           System.out.println(" gusse a number 0  to 100");
           gusse =input.nextInt();
           if (gusse > num )
               System.out.println(" it is  to high come down "); 
               if (gusse < num )
               System.out.println(" it is  to small go up ");   c++;
    }
        System.out.println("your correct the numder is " + num +" in " + c + " times");
}}
