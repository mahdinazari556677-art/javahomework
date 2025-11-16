
package optingproblom.fanction;

public class OptingproblomFanction {

       public static int sum(int i1,int i2 ){
        int sum = 0;
       
        for (int i =i1;i<=i2;i++){
            sum +=i;}
        System.out.println("this is sum "+sum);
        return sum;
       }
    public static void main(String[] args) {
      
        System.out.println("this sum is between 1to 10:"+sum(1,10));
          System.out.println("this sum is between 10to 20:"+sum(20,30));
          System.out.println("this sum is between 35to 45:"+sum(35,45));

    }
}

    