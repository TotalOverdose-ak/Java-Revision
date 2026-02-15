abstract class Car {

   // public void drive();
   public abstract void drive();
    public abstract void drive();
    public abstract void fly();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}
//2nd option to make other child class
abstract class WagonR extends Car  {

    public void drive() {
        System.out.println("Driving...");
    }

 
}
class Akash extends WagonR {
       public void fly() {
        System.out.println("Flying...");
    }
}


public class Example4{
    public static void main (String[] args) {
Car obj = new Akash();
WagonR obj2 = new Akash(); // both are correct
obj.drive();
obj.playMusic();
obj2.drive();
obj2.playMusic();


    }
}