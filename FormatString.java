
package formatstring;

public class FormatString {

    public static void main(String[] args) {
     //cha4_1();
     //cha4_2();
    //cha4_3();
     
    }
     public static void cha4_1(){
          double amount=12617.22;
      double intersetRate=0.076;
      double interset = amount*intersetRate;
        System.out.println("interset is"+interset);
     } 
      public static void cha4_2(){
           double amount=12617.22;
      double intersetRate=0.076;
      double interset = amount*intersetRate;
          System.out.println("interset is $"+(int)(interset*100)/100.0);
      }
          
          public static void cha4_3(){
              
           double amount=12617.22;
      double intersetRate=0.076;
      double interset = amount*intersetRate;
          System.out.println("interset is $%4.2f"+interset);
          }
      
      }

