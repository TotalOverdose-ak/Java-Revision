package Video3_More;

interface A {
    void show();

    void config();
}

interface X {
    void run();
}

interface Y extends X {
    void walk();

}

class B implements A, Y {

    public void show() {
        System.out.println("In Show");
    }

    public void config() {
        System.out.println("In Config");
    }

    public void run() {
        System.out.println("Running");
    }

    public void walk() {
        System.out.println("Walking");
    }
    /*
     * Relation Keyword
     * Class → Class extends
     * Class → Interface implements
     * Interface → Interface extends
     * 
     * Object decides implementation.
     * Reference decides accessible methods.
     * 
     * 🔥 4️⃣ Reference Type Important Hai
     * 
     * Suppose:
     * 
     * B obj = new B();
     * 
     * 
     * Tum sab methods call kar sakte ho.
     * 
     * Lekin agar:
     * 
     * A obj = new B();
     * 
     * 
     * Toh:
     * 
     * ✔ show()
     * ✔ config()
     * 
     * ❌ run() call nahi kar sakte
     * 
     * Kyuki reference A hai.
     * 
     * Similarly:
     * 
     * X obj = new B();
     * 
     * 
     * ✔ run()
     * ❌ show()
     * ❌ config()
     */

}

public class Example2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
        obj.run();
        A obj1 = new B();
        obj1.show();
        obj1.config();
        X obj2 = new B();
        obj2.run();
    }
}
