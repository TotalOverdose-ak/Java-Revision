@FunctionalInterface
interface A {
    void show();
}

// ✔ Sirf ek method (SAM me)
// ✔ Isliye Lambda use kar sakte hain
/*
 * Functional Interface me sirf 1 method hota hai.
 * 
 * Compiler ko clear hai:
 * 
 * 👉 Is lambda ka implementation kis method ke liye hai.
 * 
 * Agar 2 methods hote → confusion.
 */
public class Example1 {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In Show");
            }
        };
        // Problem ❌
        // Bahut verbose (zyada syntax).
        obj.show();

    }
}