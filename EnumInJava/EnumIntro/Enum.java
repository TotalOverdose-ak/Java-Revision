package EnumIntro;

/*Enum = Named Constants

Matlab:

Jab tumhare paas fixed set of values ho
Jo change nahi hone chahiye
Tab enum use karte hain.
Example:

Status → RUNNING, FAILED, PENDING, SUCCESS

Days → MONDAY, TUESDAY…

Directions → NORTH, SOUTH… */
enum Status {
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS
}
/*
 * Status ek type hai
 * 
 * RUNNING, FAILED, PENDING, SUCCESS → constants
 */

public class Enum {
    public static void main(String[] args) {
        Status s = Status.RUNNING; // int i = 5;
        // Status ek class hai RUNNING, FAILED etc. → objects of Status
        // Status s = Status.NOTHING; // ❌ ERRORKyuki enum me sirf wahi values allowed
        // hain jo define ki hain. Yeh type safety deta hai.

        System.out.println(s);
    }
}
