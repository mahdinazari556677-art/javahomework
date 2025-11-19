
package greatestcommonmethod;

import java.util.Scanner;

public class GreatestcommonMethod {

    public static void main(String[] args) {
     Scanner input =new Scanner (System.in);
        System.out.println("enter first intger ");
        int n1=input.nextInt();
        System.out.println(" enter scond intger ");
        int n2=input.nextInt();
        System.out.println("you number are "+n1+"and"+n2);
        System.out.println("the gratest comman diviser for "+n1 +"and "+n2+"is"+
                gcd(n1,n2));
    }
    public static int gcd(int n1,int n2){
        int gcd=1;
                
        int j=2;
        while (j<=n1&&j<=n2){
        if (n1%j==0&&n2%j==0)
         gcd=j;   
        j++;}
        return gcd;
    
    }
}

           