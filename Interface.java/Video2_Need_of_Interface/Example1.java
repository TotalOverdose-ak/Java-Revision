package Video2_Need_of_Interface;

class Laptop {

    public void code() {
        System.out.println("Code, Compile, Run");
    }
}

class Desktop {

    public void code() {
        System.out.println("Code, Compile, Run Faster");
    }
}

// Ab problem:

// Developer Laptop accept karta hai.
// Desktop accept nahi karega.

// Design rigid hai.
class Developer {

    public void devApp(Laptop lap) {
        lap.code();
    }
}

public class Example1 {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Developer dev = new Developer();

        dev.devApp(lap);

    }
}

/**
 * Developer directly Laptop pe dependent hai.
 * 
 * Agar company bole:
 * 
 * Laptop nahi milega, Desktop milega.
 * 
 * Toh?
 * 
 * Developer ka method accept karta hai:
 * 
 * Laptop lap
 * 
 * 
 * Desktop pass nahi kar sakte ❌
 * 
 * This is called:
 * 
 * 👉 Tight Coupling
 * 
 * Developer dependent hai ek specific class pe.
 */