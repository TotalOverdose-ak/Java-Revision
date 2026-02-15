public class Interfacee{  //yaha Interfacee class by default Object ko extends karra hia 
// super() Parent class by default all class call this method first 
    interface A{
        void show();
       void get();
    }
    public static class B implements A{
       public  void show(){
            
            System.out.println("THis is show");
        }
       public void get(){
            
            System.out.println("THis is get");
        }
    }
    // public static void main (String[] args) {
    //     /* code */
    //     A obj = new B();
    //     obj.show();
    // }
}