public class BoxMain{
    public static void main (String[] args) {
        //without generics with object datatype
        Box b = new Box("Akash");
        System.out.println(b.showAndGet());
        b.container=2;
        System.out.println(b.showAndGet());
        //with generics keyword with class<T> dimond shape me public class <T> BoxMian{}
        BoxGen bg = new BoxGen("Akash");
        System.out.println(bg.showGen());
        bg.container=2;
        System.out.println(bg.showGen());
        
        //typesafety
        BoxGen<String> bg1 = new BoxGen<>("Akash with t safe");
        System.out.println(bg1.showGen());
         // bg1.container=2;
          // System.out.println(bg1.showGen());   //throw an error to me 
          
          //getClass().getName();
             System.out.println(bg1.container.getClass());
             System.out.println(bg1.container.getClass().getName());
             
             //Integer
             BoxGen<Integer>bg2 = new BoxGen(7);
              System.out.println(bg2.showGen());
             //System.out.println(bg1.container.getClass());
             System.out.println(bg2.container.getClass().getName());
             
             //instance of method 
             bg1.performSomeTask();
             bg2.performSomeTask();
             
    }
}