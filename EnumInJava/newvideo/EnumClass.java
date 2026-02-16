package newvideo;

import java.lang.reflect.Constructor;

//Enum internally class hi hoti hai.
//enum Status { }  == Internally something like: final class Status extends Enum<Status>
/*
name()
ordinal()
compareTo()
values() 

java.lang.Enum

proof
Status s = Status.RUNNING;
System.out.println(s.getClass().getSuperclass());


Enum constructor private hota hai.
Kyuki enum ke objects bahar se create nahi kar sakte.

*/
enum Laptop {

    MACBOOK(2000), // objects of class laptops
    XPS(2200),
    SURFACE(1500),
    // SURFACE, if i dont mension value for it it show error
    // need to mension value SURFACE() //Agar tum ek constant bina parameter ke
    // likho:
    // soln Default Constructor Add Karo
    AKASH,
    THINKPAD(1800);

    private Laptop() {
        this.price = 500;
        System.out.println("Creating " + this.name());
    } // so akash can take value from here

    private int price;

    // Constructor()
    private Laptop(int price) {
        this.price = price;
        // Constructor Kitni Baar Call Hota Hai? javb enum obj load hue to
        System.out.println("Creating " + this.name());
    }

    public int getPrice() {
        return price;
    }
}

public class EnumClass {

    public static void main(String[] args) {

        Laptop lap = Laptop.MACBOOK;// called to =>Laptop(2000)
        /*
         * Har constant ek object hai
         * Har object ka apna price hai
         */
        System.out.println(lap); // MACBOOK
        System.out.println(lap.getPrice()); // 2000

        // loop in enum
        // for(int i=0;i<lap.length;i++){
        // Important Point 🔥
        // Enum constants jab load hote hain tab constructor call hota hai.

        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.getPrice());
        }

    }
}
