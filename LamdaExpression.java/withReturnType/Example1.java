package withReturnType;

@FunctionalInterface
interface A7 {
    public abstract int get(int i, int j);
}

public class Example1 {
    public static void main(String[] args) {
        A7 obj7 = new A7() {

            @Override
            public int get(int i, int j) {
                return i + j;
            }

        };
        int res = obj7.get(7, 8);
        System.out.println(res);
    }
}
