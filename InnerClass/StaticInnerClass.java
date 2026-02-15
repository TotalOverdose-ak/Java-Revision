
class A { //✔ Static inner class ko outer object nahi chahiye 
//static class A is wrong outer class canot 

    static class B {
        void display() {
                System.out.println("Hello");
            }
        public void config() {
            System.out.println("In Config");
        }
    }
      B obj = new B();
      obj.display();
}

public class StaticInnerClass{
    public static void main (String[] args) {
        A.B obj = new A.B();//aha outer object ki zarurat nahi.
        obj.config();

    }
}