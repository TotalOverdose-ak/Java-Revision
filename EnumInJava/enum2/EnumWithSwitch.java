package enum2;

enum Status5 {
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class EnumWithSwitch {

    public static void main(String[] args) {

        Status5 s = Status5.SUCCESS;

        switch (s) {

            case RUNNING:
                System.out.println("All Good");
                break;

            case FAILED:
                System.out.println("Try Again");
                break;

            case PENDING:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
        }
    }

}
