//(parameters) -> { body }    Lambda ka syntax:
@FunctionalInterface
interface A1 {
    void show();
}

/*
 * Compiler already jaanta hai:
 * 
 * Interface A hai
 * 
 * Method show() hai
 * 
 * Return type void hai
 */
public class Example2 {
    public static void main(String[] args) {
        A1 obj = () -> {
            System.out.println("In Show");
        };
        obj.show();
    }
}
/*
 * ✔ No class
 * ✔ No public
 * ✔ No override
 * ✔ No method name
 */