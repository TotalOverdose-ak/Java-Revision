package EnumIntro;

//values() Method
enum Status2 {
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS
}

public class Example3 {
    public static void main(String[] args) {
        Status2 arr[] = Status2.values();
        // System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // for (Status2 s : arr) {
        // System.out.println(s);
        // }
    }
}
/*
 * ❌ String use karoge:
 * "Running", "RUNNING", "runing" → error prone
 * 
 * Status s = Status.RUNNING;
 * No spelling mistakes
 * Type safe
 * Fixed values only
 * Behind the scenes:
 * final class Status extends Enum<Status>
 * Har constant:
 * public static final Status RUNNING = new Status();
 * 
 * Isliye:
 * Static
 * Final
 * Fixed number of objects
 */

/*
 * 🔥 1️⃣1️⃣ Real Life Example
 * 
 * Server response codes:
 * 
 * Instead of:
 * 
 * int status = 404;
 * 
 * 
 * Better:
 * 
 * enum Status {
 * OK,
 * NOT_FOUND,
 * INTERNAL_ERROR
 * }
 * 
 * 
 * Readable + Safe.
 */