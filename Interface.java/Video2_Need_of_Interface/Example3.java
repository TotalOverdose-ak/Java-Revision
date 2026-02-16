package Video2_Need_of_Interface;

interface Computer3 {
    public void code();

}

class Laptop3 implements Computer3 {

    public void code() {
        System.out.println("Code, Compile, Run");
    }
}

class Desktop3 implements Computer3 {

    public void code() {
        System.out.println("Code, Compile, Run Faster");
    }
}

class Developer3 {

    public void devApp(Computer3 comp) {
        comp.code();
    }
}

public class Example3 {
    public static void main(String[] args) {

        Computer3 Lap = new Laptop3();
        Computer3 Desk = new Desktop3();
        Developer3 dev3 = new Developer3();
        dev3.devApp(Lap);
        dev3.devApp(Desk);
    }
}
