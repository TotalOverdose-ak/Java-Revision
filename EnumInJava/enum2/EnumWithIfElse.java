package enum2;

enum Status4 {
    RUNNING,
    FAILED,
    PENDING,
    SUCCESS
}

public class EnumWithIfElse {
    public static void main(String[] args) {
        Status4 s = Status4.RUNNING; // Maan lo yeh value kisi method se aayi hai.
        s = Status4.SUCCESS;
        /*
         * 👉 == use karte hain Bilkul safe hai. s == Status.RUNNING
         * Enum constants fixed hote hain
         * Java internally same object refer karta hai
         * String me == unsafe hota hai
         * Enum me == perfectly safe hai ✅
         * Kyuki enum constants singleton objects hote hain.
         */
        if (s == Status4.RUNNING)
            System.out.println("Running...");
        else if (s == Status4.FAILED)
            System.out.println("Failure");
        else if (s == Status4.PENDING)
            System.out.println("Wait Please");
        else
            System.out.println("done");
    }
}