
package passbyvalue2;

public class Passbyvalue2 {

    public static void main(String[] args) {
      int num1=2;
      int num2=4;
      
      
        System.out.println("Befor invaking"+num1+"and"+num2);
        
       swap(num1,num2);
        System.out.println("after invaking"+num1+"and"+num2);}
       public static void swap(int n1,int n2) {       
            System.out.println("\t\t After swaping n1 is"+n1+"n2 is "+n2);

            System.out.println("\t inside the swap method");
            System.out.println("\t\tBefor swaping n1 is "+n1+"and n2 is  "
                    + n2);
            int temp =n1;
            n1=n2;
               n2=temp;
            System.out.println("\t\t After swaping n1 is "+n1+"and n2 is "+n2);
            
        
    }
    
}
