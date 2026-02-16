package Video1_Interface;
interface A1 {

    public abstract void show();

    public abstract void config();
}

// /**
// * By default → public
// * By default → abstract
// * //A obj = new A(); // ERROR no objectinstantiate
// *
// * //Sirf abstract methods hain
// * //Koi normal method nahi
// * Jab abstract class me sirf abstract methods hote hain
// * Tab hum better design ke liye interface use karte hain.
// *
// *
// * /*implements keyword use hota hai
// * extends nahi
// * Sab methods implement karna compulsory as it is abstarct
// */
class B1 implements A1 {
    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In Config");
    }

}

public class Example2 {
    public static void main(String args[]) {
        A1 obj = new B1();
        obj.show();
        obj.config();

    }
}
