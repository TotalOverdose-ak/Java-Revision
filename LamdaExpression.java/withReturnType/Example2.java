package withReturnType;

interface A {
    public abstract int sum(int a, int b);
}

public class Example2 {
    public static void main(String[] args) {
        // A obj = (a, b) -> {
        // return a + b;
        // };
        A obj5 = (a, b) -> a + b;
        int res = obj5.sum(7, 8);
        System.out.println(res);
    }

}
