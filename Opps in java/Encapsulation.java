  class Human{
      //human class is package private default
      //same package ke andar hi accessible hai ye class 
      //dusre pkg me nahio 
       private int age;//accesible in same class
       private String name;
       Human(){
           age=21;
           name="akash";
       }
       public void getDetails(){
           System.out.println("age is "+age+" name is "+name);
       }
       public void setAge(int age){
           this.age=age;
           
       }
       
    }
public class Encapsulation{


    // public static void main (String[] args) {
    //     Human obj=new Human();
    //     //this is not accessible use getter
    //     // obj.age=21;
    //     // obj.name="Akash";
    //     // System.out.println(obj.name);
    //     //this is getter to access
        
    //     //sirf metthod se hi data change kar StackTraceElement//
    //     //binding data to methods
        
    //     //direct access not allow by manipulating obj
    //     obj.setAge(7);
    //     obj.getDetails();
        
    
    // }
}
