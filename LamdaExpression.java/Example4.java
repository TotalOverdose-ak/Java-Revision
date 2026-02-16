@FunctionalInterface
interface A2 {
    void show(int i);
}

public class Example4 {
    public static void main(String[] args) {
        // with paramter
        A2 obj = (i) -> {
            System.out.println("In Show " + i);
        };
        obj.show(5);
    }
}
