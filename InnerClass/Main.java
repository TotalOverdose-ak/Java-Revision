class A {

    int age;

    public void show() {
        System.out.println("In Show");
    }

    class B {

        public void config() {
            System.out.println("In Config");
        }
    }
}

/*Ek class sirf dusri class ke kaam ke liye bani ho

Bahar use nahi karni

Logically us class ka existence sirf outer class ke andar hi ho*/
public class Main{
    public static void main (String[] args) {
     //   B obj = new B();   // ERROR
       A obj = new A(); //Pehle outer class ka object banao:
      A.B obj1 = obj.new B(); //Phir inner class ka object:
    }
}