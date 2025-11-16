
package chinesezodia;

import java.util.Scanner;

public class ChineseZodia {

    public static void main(String[] args) {
  Scanner input =new Scanner (System.in); 
        System.out.println("please enter your year");
  int year=input.nextInt();
  switch(year%12){
      case 1:System.out.println("Monkey"); break;
      case 2: System.out.println("rosster");break;
       case 3: System.out.println("dog");break; 
        case 4: System.out.println("pig");break;
           case 5: System.out.println("rat");break;    
         case 6: System.out.println("fox");break; 
           case 7: System.out.println("tiger");break;
             case 8: System.out.println("rabbit");break;
             case 9: System.out.println("dragon");break;
             case 10: System.out.println("snake");break;
             case 11: System.out.println("horse");break;
             case 12: System.out.println("sheep");break;
           
    }  
  
    }
    
}
