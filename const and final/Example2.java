final class A{   //vs final class Ak{} then X class Bk cant exttends Ak 
    public void show(){
        System.out.println("in Ak");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class B /*extends A*/{       // cannot inherit from final A
    
}
public class Example2{
     /*  public static void main (String[] args) {
       
    }    */
}