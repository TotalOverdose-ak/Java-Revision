class A3{
    public void show(){
        System.out.println("in a A Show");
    }
}
class B3 extends A3{
       public void show(){
        System.out.println("in a B Show");
    }
}
class C3 extends B3{
       public void show(){
        System.out.println("in a C Show");
    }
}
class D3{
            //yaha D3 ka baap C nahi hai so D ka relation A ke sath nahi hai dusri khandan ka hai ye 
}

public class RuntimePolymorphism{
    
    public static void main (String[] args) {
        A3 obj = new A3();
        obj.show();
        
        obj=new B3();//B overrides show method of args
        obj.show();
        
        obj=new C3();
        obj.show();
        /*
        obj=new D3();//error ayega line no 17 refer
        obj.show();
        
        */
        
    }
}