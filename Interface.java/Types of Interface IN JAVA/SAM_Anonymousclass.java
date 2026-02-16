@FunctionalInterface
interface A1 {
    void show();
    // void Ak();
}

public class SAM_Anonymousclass {
    public static void main(String[] args) {
        A1 obj = new A1() {
            public void show() {
                System.out.println("This is anonymous class methods");
            }

            // public void Ak() {
            // System.out.println("akash");
            // }
        };
        obj.show();
        // obj.Ak();
    }
}
