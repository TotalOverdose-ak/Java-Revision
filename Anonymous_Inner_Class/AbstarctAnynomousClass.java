abstract class A3{
    abstract void show3();
}
public class AbstarctAnynomousClass{
    public static void main (String[] args) {
       A3 obj3 = new A3(){ //ye obj A3 ka nahi hai us anonymous class ka hai 
            void show3(){
             System.out.println("this ia abstract anonymous class");
         }  
    };
       obj3.show3();
    }
}