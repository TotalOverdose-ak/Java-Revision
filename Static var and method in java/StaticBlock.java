public class StaticBlock {

    public static class Test {

        // Static variable → class level variable
        // Ye sab objects ke liye common hota hai
        static String name;

        // Non-static variables → object level variables
        // Har object ki apni alag copy hoti hai
        int rollno;
        String phone;

        /*
         Static Block:  satic var only run ones time
         - Ye tab execute hota hai jab class memory me load hoti hai.
         - Ye sirf ek baar execute hota hai.
         - Ye constructor pe depend nahi karta.
         - Agar object create na bhi kare,
           phir bhi static block run ho sakta hai.
         
         Example:
         Class.forName(className:"StaticBlock$Test");
         Isse sirf class load hogi aur static block run hoga,
         lekin koi object create nahi hoga.
        */
        static {
            name = "Akash";
            System.out.println("Static block executed");
        }

        /*
         Constructor:
         - Ye har baar execute hota hai jab naya object create hota hai.
         - Agar hum object create nahi karenge,
           to constructor execute nahi hoga.
        */
        Test() {
            rollno = 7;
            phone = "93074";
            System.out.println("Constructor executed");
        }

        // Non-static method → object se call hota hai
        public void show() {
            System.out.println(name + " " + rollno + " " + phone);
        }
    }

    public static void main(String[] args) throws Exception {

        // Sirf class load karna (object create nahi karna)
        // Isse static block run hoga
        Class.forName("StaticBlock$Test");

        System.out.println("Class loaded without creating object");

        // Ab object create karte hain
        Test t1 = new Test();
        t1.show();
    }
}