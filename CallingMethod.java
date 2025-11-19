
package callingmethod;

public class CallingMethod {

    public static void main(String[] args) {
      int i=3;
      int j=5;
      int k=max(i,j);
        System.out.println("the maxmam is "+i+"and"+j+"is "+k);
      
      
    }
    public static int max(int num1,int num2){
        int result ;
        if (num1>num2)
        result =num1;
        else 
        return num2;
        return result;
    }
}
