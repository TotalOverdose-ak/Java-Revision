public class Inhertance1 extends Inheritance{  
    //this is by default in default constructor and default constructor created automatically when i obj create
    Inhertance1(){
        
        super(10);
       System.out.println("this is an Child Default");
       
    
    }
    Inhertance1(int n){
       
        this();
        System.out.println("this is an Child int");
         
    }
    
 public int div(int a ,int b){
     return a/b;
     
 }
 public int mul(int a,int b){
     return a*b;
 }
 
 public static void main (String[] args) {
    Inhertance1 i = new Inhertance1(8);
    //it actually help to reduce redundancy else i have to write here add and sub method also here
     System.out.println( i.add(7,8));
 }
}