package Video3_More;

interface Computer {
    public void code();

}

interface Computer1 {
    void demo();

}

/*
 * 🔥 Important Rule
 * 
 * Class:
 * 
 * ❌ Multiple classes extend nahi kar sakti
 * 
 * ✅ Multiple interfaces implement kar sakti
 * 
 * Ye hi reason hai interface powerful hai.
 * 
 * class B extends A, X // ❌ ERROR Abstract Class Me Ye Possible Hai? Java
 * multiple inheritance allow nahi karta classes me.
 * class B implements A, X // ✅ Allowed
 * 
 * 
 * interface X {
 * void run();
 * }
 * 
 * interface Y extends X {
 * void walk();
 * }
 * 
 * 
 */
class Laptop implements Computer, Computer1 {

    public void code() {
        System.out.println("Code, Compile, Run");
    }

    public void demo() {
        System.out.println("Demo method");
    }
}

class Desktop implements Computer, Computer1 {

    public void code() {
        System.out.println("Code, Compile, Run Faster");
    }

    public void demo() {
        System.out.println("Demo method in Desktop");
    }
}

class Developer {

    public void devApp(Computer comp) {
        comp.code();
    }

    public void devDemo(Computer1 comp) {
        comp.demo();
    }
}

public class Example1 {
    public static void main(String[] args) {

        Computer Lap = new Laptop();
        Computer Desk = new Desktop();
        Computer1 Lap1 = new Laptop();
        Computer1 Desk1 = new Desktop();
        Developer dev3 = new Developer();
        dev3.devApp(Lap);
        dev3.devApp(Desk);
        dev3.devDemo(Lap1);
        dev3.devDemo(Desk1);
    }
}
