
package nestedloops;

public class NestedLoops {
    public static void main(String[] args) {
        System.out.println("Multiplication table ");
        System.out.println("\n------------------");
        System.out.print("  ");
        for (int h=1;h<=9;h++)  
            System.out.print(""+h);
       
        for (int i=1;i<=9;i++){
            System.out.print("i="+i);
    
    for  (int j=1;j<=9;j++){
        System.out.printf(" %4d",i*j);
           }
            System.out.println();}
        }
}