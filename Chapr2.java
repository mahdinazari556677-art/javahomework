
package chapr2;

import java.util.Scanner;

public class Chapr2 {
    public static void main(String[] args) {
//ch2_1();
//ch2_2();
//ch2_3();
//ch2_4();
//ch2_5();
//ch2_6();
//ch2_7();
//ch2_9();
//ch2_10();
//ch2_11();
//ch2_12();
//ch2_13();
    }
    public static void ch2_1(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double celciuse=input.nextDouble();
        double fahrenhiet=(9.0/5)*celciuse+32;
        System.out.println(celciuse+"celcusse is"+fahrenhiet+"fahrenhiet");
    }
     public static void ch2_2(){
         Scanner input=new Scanner(System.in);
         System.out.println("Enter the radius and length of a cylinder:");
         double radius=input.nextDouble();
         double length=input.nextDouble();
         double area=radius*radius*Math.PI;
         double volume=area*length;
         System.out.println("The area is"+area);
         System.out.println("The valume is"+volume);
     }
      public static void ch2_3(){
          Scanner input=new Scanner(System.in);
          System.out.println("Enter a value for feet:");
          double feet=input.nextDouble();
          double meters=feet*0.305;
          System.out.println(feet+"feet is "+meters+"meters");
      }
      public static void ch2_4(){
          Scanner input=new Scanner(System.in);
          System.out.println("Enter a number in pounds:");
          double pound=input.nextDouble();
          double kilogram=pound*0.454;
          System.out.println(pound+"pound is"+kilogram+"kilogram");
      }
        public static void ch2_5(){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the subtotal and a gratuity rate:");
            double subtotal=input.nextDouble();
            double gratuity=input.nextDouble()/10;
            double total=subtotal+(gratuity);
            System.out.println("The gratuity is "+gratuity+"and"+"total is"+total);
        }
         public static void ch2_6(){
             int number=(int)(Math.random()*999)+1;
             Scanner input=new Scanner(System.in);
             System.out.println("enter a number between 0  1000");
             int n=input.nextInt();
             int sum=0;
             sum+=n%10;  
              sum+=n%10;  
               sum+=n%10 ; 
               System.out.println("the sum fore this digit is "+sum); 
         }
           public static void ch2_7(){
               Scanner input=new Scanner(System.in);
               System.out.print("Enter the number of minutes");
               double minutes=input.nextInt();
               double days=minutes/60*24;
               double year=days/365;
               double remainday=days%365;
               System.out.println(minutes+"minutes is approximately"+year+"years"+"and"+remainday+" days");
           }
          public static void ch2_9(){
              Scanner input=new Scanner(System.in);
              System.out.print("Enter vo:");
              double v0=input.nextDouble();
               System.out.print("Enter v1:");
                double v1=input.nextDouble();
                System.out.print("Enter t:");
                 double t=input.nextDouble();
                 double a=(v1-v0)/t;
                 System.out.println("The average acceleration is:"+a);
          }
       public static void ch2_10(){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the amount of water in kilograms: ");
            double M=input.nextDouble();
            System.out.print("Enter the initial temperature:");
            double initialtemperature=input.nextDouble();
            System.out.print("Enter the final temperature: ");
                    double finaltemperature=input.nextDouble();
                    double Q = M * ( finaltemperature - initialtemperature) * 4184;
                    System.out.println("The energy needed iS"+Q);
       }
         public static void ch2_11(){
             Scanner input=new Scanner(System.in);
             final int currentpopulation=312032486;
             final int secondsperyear=365*24*60*60;
             System.out.println("Enter the number of year");
             int year=input.nextInt(); 
             int births=secondsperyear/7;
             int death=secondsperyear/13;
             int immigrants=secondsperyear/45;
             int netchangeperyear=births-death+immigrants;
             Long futurepopulation=currentpopulation+(long)year+netchangeperyear;
             System.out.println("The population in 5 years is"+futurepopulation+ netchangeperyear);
         }
                public static void ch2_12(){
                     Scanner input=new Scanner(System.in);
                     System.out.println("Enter speed :");
                     int v=input.nextInt();
                      System.out.println("Enter  acceleration:");
                      int a=input.nextInt();
                      double length=v*v/2*a;
                      System.out.println("The minimum runway length for this airplane is :"+length);
                }
                 public static void ch2_13(){
                     Scanner input=new Scanner(System.in);
                     System.out.println("Enter monthly saving amont");
                     double monthlysaving=input.nextDouble();
                     System.out.println(" Enter annual intrest rate:");
                     double annual=input.nextDouble();
                     System.out.println("Enter a number of month");
                     int month=input.nextInt();
                     double monthlayrate=annual/100.0/12.0;
                    
                     double amount=0.0;
                     System.out.println("After the sixth month, the account value is"+monthlayrate);
                     
                     
                 }
}   
    


    
    

