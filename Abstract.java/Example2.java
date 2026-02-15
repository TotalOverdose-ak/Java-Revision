class Car {

   // public void drive();
   public abstract void drive();


    public void playMusic() {
        System.out.println("Playing Music");
    }
}
public class Example2{
public static void main (String[] args) {
Car obj = new Car();
obj.drive();
obj.playMusic();

    }
}