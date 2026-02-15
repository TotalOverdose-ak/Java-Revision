class A1 {

    public void show() {
        System.out.println("In A Show");
    }
}
//Behavior Change Karna (Method Overriding Way)
class B1 extends A1 {

    public void show() {
        System.out.println("In B Show");
    }
}
/*Extra .class file banegi
Extra class create karni padegi
Code heavy ho jayega
Agar use sirf ek hi jagah hai, toh alag class banana unnecessary hai.*/

public class Main {
    /*public static void main(String[] args) {

        A1 obj = new A1();
        obj.show();
        A1 obj5 = new B1(); //override
        obj5.show();
    } */
}
