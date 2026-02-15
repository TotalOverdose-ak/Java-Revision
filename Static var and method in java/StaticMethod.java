public class StaticMethod{
    //ham static method me non static variablee ko use nahi kar sakte hai 
    //static var ko hi static method me use karna padta  hai 
    //sath hi jo bhi static method ham log banate hai uske liye object banane ki no grj
 static class Mobile{
     static String name; //ye final aur static var bana sakte hai ham 
     int rollno;
    static  String showName(){  //can be call dierctly without creating an object by using class name
        return name;
     }
     void showDetails(){
         System.out.println(rollno+ " is rollno and "+name+" is the name ");
     }
  //   static void staticDetails(){
     //    System.out.println(rollno); //non-static variable rollno cannot be referenced from a static context
         //roll no har obj ke liye alg alg hoga mb =0 mb1 =9 so jab ham object banate to its confuse kiska hai ye rollno
         //Mobile.staticDetails() issa karege tab isiliye java rok raha hai muze
   //  }
     //correct way with obj passing as a parameter
     static void staticmetho(Mobile ak){// refrence pass karna paddega as a paramter java ko bolne ke liye
         System.out.println(ak.rollno+" "+name);
     }
}
    public static void main (String[] args) {
    //     /* code */
    //     Mobile mb = new Mobile();
    //     mb.name="akash";
    //     mb.rollno=9;
    //     Mobile mb1=new Mobile();
    //     mb1.showDetails(); //as rollno is not static variable  
    //     mb.showDetails();
    //     System.out.println(Mobile.showName());
    //   //  mb1.staticDetails();
    //   Mobile.staticmetho(mb);
     }
}