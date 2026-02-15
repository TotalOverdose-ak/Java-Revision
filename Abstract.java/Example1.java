
class Car {

    public void drive() {

    }

    public void playMusic() {
        System.out.println("Playing Music");
    }
}
public class Example1{
    public static void main (String[] args) {
Car obj = new Car();
obj.drive();
obj.playMusic();

    }
}
//one most imp thing is abstract class me abstract method hona not zaruri direct obj creation rok sakte hai ham isse

/*Hum class design karte waqt decide karte hain:
Kaunse methods hone chahiye
Kaunse features compulsory hain
Kabhi kabhi:
Feature hona zaroori hai
Par implementation nahi pata hota

Example:
Car ko drive karna hi chahiye
Par engine ka logic nahi pata
Toh method delete nahi kar sakte
Isliye abstract use karte hain 


abstract void drive();
Iska matlab:
Drive feature hona chahiye
Par kaise chalega wo child class batayegi


3️⃣ Abstract Method Rules

✅ Abstract method ke paas body nahi hoti
❌ Curly brackets nahi hote
❌ Direct object me use nahi hota

If class contains abstract method
→ Class must be abstract
abstract class Car {
    abstract void drive();
}

Abstract class me multiple abstract methods ho sakte hain:
Child class ko dono implement karna compulsory hai
🔟 Agar Child Implement Na Kare?

Do option:
Sab implement karo
Child ko bhi abstract bana do

1️⃣1️⃣ Concrete Class Kya Hai?
Jo class:
Fully implemented ho
Koi abstract method pending na ho
Jiska object ban sake
Usko kehte hain:

👉 Concrete Class


1️⃣3️⃣ Final Summary (Exam Revision Points)
Abstract method → no body
Abstract method → class must be abstract
Abstract class → object cannot be created
Child class must implement abstract methods
Abstract class can have normal methods
Fully implemented class = Concrete class
*/
