class A1{   
    public final void show(){
        System.out.println("in Ak");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class B1 extends A1{
        public void show(){
              System.out.println("in Bk");
          }
}
public class Example3{
    public static void main (String[] args) {
        /* code */
        A1 s = new B1();   // in B1 cannot override show() in A1
        s.show();
    }
}