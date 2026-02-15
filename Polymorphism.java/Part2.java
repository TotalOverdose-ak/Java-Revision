class A1{
    public void show(){
        System.out.println("in a A Show");
    }
}
class B1 extends A1{
    public void show(){
        System.out.println("in a B Show");
    }
} 
public class Part2{
    
  public static void main (String[] args) {
        A1 obj2 = new A1();
        obj2.show();
        B1 obj3 = new B1();
        obj3.show();
      
        A1 obj1 =new B1(); //method overriding
        obj1.show();
        
        
       /* science behind Iterable
        Compiler sirf yeh check karta hai:
        A1 me show() method exist karta hai ya nahi?
        4️⃣ Runtime me kya hota hai?
         Runtime par JVM dekhta hai:
         "  Actual object ka type kya hai?"
            Yaha object bana hai:
              new B1() 
sm

Toh JVM bolega:

👉 "Object B1 ka hai, to B1 ka show() run hoga"
        Variables → compile time par decide hote hain
        Methods (overridden) → runtime par decide hote hain
     
 
       //B1 obj4 = new A1();
        //obj4.show(); //incompatible              */

    } 
}