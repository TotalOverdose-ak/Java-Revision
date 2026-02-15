abstract class Car {

   // public void drive();
   public abstract void drive();
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}
class WagonR extends Car {

    public void drive() {
        System.out.println("Driving...");
    }
    /*WagonR me sirf drive() implement hai.

Toh error aayega:

Must implement fly()*/
}

public class Example4{
    public static void main (String[] args) {
Car obj = new WagonR();
obj.drive();
obj.playMusic();


    }
}