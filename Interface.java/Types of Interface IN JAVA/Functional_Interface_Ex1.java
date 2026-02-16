/*Functional Interface =
👉 Interface jisme sirf 1 abstract method ho.

Isko bolte hain:
SAM → Single Abstract Method
Functional Interface*/

//simpel example of an interface 
@FunctionalInterface // Yeh compile-time safety deta hai.
// Agar tum sirf 1 method rakhna chahte ho 2 RAKHDO TO ERROR
interface A { // public abstract likhne ki zarurat nahi
    // Automatically public + abstract hota hai INTERFACE KOI BHI
    void show();
    // VOID AK()
}

class B implements A {

    public void show() {
        System.out.println("In Show");
    }
}

public class Functional_Interface_Ex1 {
    public static void main(String[] args) {
        B obj = new B();
        A obj2 = new B();

        obj2.show();// same op
        obj.show();
    }
}