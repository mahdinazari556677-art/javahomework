
package testvoidmethod;

public class Testvoidmethod {

    public static void main(String[] args) {
        System.out.println("the grads is ");
     printGrade(95.5);
        System.out.println("the geade is ");
        printGrade(85.4);
    }
    
    
    
    
    public static void printGrade(double score){
     if (score>=90){
            System.out.println('A');}
     
     else  if (score>=80){
            System.out.println('B');}
     
     else  if  (score>=70){
            System.out.println('C');}
     
    else if (score>=60){
            System.out.println('D');}
    else if (score<=60){
            System.out.println('E');}
     
    }
}
