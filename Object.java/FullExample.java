class Laptop {

    String model;
    int price;

    @Override
    public String toString() {
        return model + " : " + price;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop that = (Laptop) o;

        return price == that.price &&
                model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return model.hashCode() ;// + price.hashCode();
    }
}

public class FullExample {

    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;

        // toString() test
        System.out.println(obj1);

        // equals() test
        System.out.println("Are objects equal? " + obj1.equals(obj2));

        // hashCode() test
        System.out.println("HashCode obj1: " + obj1.hashCode());
        System.out.println("HashCode obj2: " + obj2.hashCode());
    }
}
