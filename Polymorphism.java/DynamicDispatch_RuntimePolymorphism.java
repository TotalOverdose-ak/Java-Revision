class A{
    public void show(){
        System.out.println("in a A Show");
    }
}
class B extends A{
    
}
class C extends B{
    
}
public class DynamicDispatch_RuntimePolymorphism{
    public static void main (String[] args) {
        B obj = new B();
        obj.show();
      
        A obj1 =new B(); 
        obj1.show();
        //obj type is A and implementation is B
          //like Computer obj1 = new Laptop() laptop is computer
    }
}