@FunctionalInterface
interface A6 {
    void show(int i);

}

public class Example5 {
    public static void main(String[] args) {
        // A6 obj = (int i) -> System.out.println("Value: " + i);
        // ✔ int remove kar diya
        // A6 obj = (i) -> System.out.println("Value: " + i);
        // ✔ Most simplified form
        A6 obj6 = i -> System.out.println("Value: " + i);
        obj6.show(10);
    }
}
