interface A3 {
    void show(int i, int j);

}

public class Example4_1 {

    public static void main(String[] args) {
        // with anonymous fun
        A3 obj = new A3() {
            public void show(int i, int j) {
                System.out.println("In Show " + i + " " + j);
            }
        };
    }
}
