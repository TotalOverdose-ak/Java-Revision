/*Annotation = Metadata

Matlab:

👉 Extra information jo hum compiler ya runtime ko dete hain
👉 Code ka behavior change nahi karta
👉 Sirf additional info deta hai*/

//Problem Without Annotation
class A {
    public void show() {
        System.out.println("In A Show");
    }
}

class B extends A {
    @Override // Compileer say There is no method to override.”
    // Bug compile time pe pakda gaya.
    public void sho() { // spelling mistake
        System.out.println("In B Show");
    }
}

public class Example1 {
    public static void main(String[] args) {
        // @Override =>Yeh compiler ko batata hai: “Main method override kar raha hoon.”
        B obj = new B();
        obj.show();
        /*
         * Tum override karna chahte the
         * Lekin spelling mistake se override nahi hua
         * Compiler ne error nahi diya
         * Logical bug create ho gaya
         */

        // Solution: @Override

    }
}