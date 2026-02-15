abstract class Car {

   // public void drive();
   public abstract void drive();


    public void playMusic() {
        System.out.println("Playing Music");
    }
}
class WagonR extends Car {

    public void drive() {
        System.out.println("Driving...");
    }
}

public class Example3{
    public static void main (String[] args) {
Car obj = new Car();   // Error

obj.drive();
obj.playMusic();

    }
}