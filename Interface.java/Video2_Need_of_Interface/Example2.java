package Video2_Need_of_Interface;

/**
 * Developer laptop pe dependent nahi hona chahiye.
 * 
 * Developer ko sirf:
 * 
 * 👉 “Computer” chahiye
 * 
 * Toh generalize karo.
 * Developer:
 * 
 * ❌ Laptop pe dependent nahi
 * ❌ Desktop pe dependent nahi
 * ✔ Computer pe dependent
 * 
 * This is called:
 * 
 * 👉 Loose Coupling
 */
abstract class Computer1 {
    public abstract void code();
}

class Laptop1 extends Computer1 {

    public void code() {
        System.out.println("Code, Compile, Run");
    }
}

class Desktop1 extends Computer1 {

    public void code() {
        System.out.println("Code, Compile, Run Faster");
    }
}

class Developer1 {

    public void devApp(Computer1 comp) {
        comp.code();
    }
}

public class Example2 {
    public static void main(String[] args) {

        Computer1 Lap = new Laptop1();
        Computer1 Desk = new Desktop1();
        Developer1 dev1 = new Developer1();
        dev1.devApp(Lap);
        dev1.devApp(Desk);
    }
}
