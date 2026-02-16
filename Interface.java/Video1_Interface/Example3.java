package Video1_Interface;
interface A {

    int age = 44; // ye static and final hote hai by default so we can access it by class name
                  // A.age
    String area = "Mumbai";

    // public static final int age = 44;
    // public static final String area = "Mumbai";
    void show();
}

public class Example3 {

    public static void main(String[] args) {
        System.out.println(A.age);
        // A.area = "Hyderabad"; // ERROR

    }
}
