//ordinal() Method
package EnumIntro;

enum Status1 {
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS
}

public class Example2 {
    public static void main(String[] args) {
        Status1 s1 = Status1.RUNNING;
        System.out.println(s1.ordinal());
        s1 = Status1.FAILED;
        System.out.println(s1.ordinal());
        /*
         * RUNNING → 0
         * FAILED → 1
         * PENDING → 2
         * SUCCESS → 3
         */

    }
}
