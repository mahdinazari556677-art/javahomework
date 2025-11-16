
package futuretuition;

public class FutureTuition {

    public static void main(String[] args) {
      int year =0;
      double tuition=10000;
      
      while (tuition<20000){
          tuition=tuition*1.03;
      year ++;}
        System.out.println("tuition will be doubled in "+year);
        System.out.printf("tuition will be $%.2f in %d years"+ tuition,year );
    }
    
}
