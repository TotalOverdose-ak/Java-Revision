//Notes 
//you can use static var in non static method as well
//static var are the var jo sabhi object ki  values ko change karte hai agar static variale ki value ko change kiye to 
//like obj1.name -"aksh"
//obj2.showname()   ye bhi aksh show karega 
public class StaticVar
{
   
static class Mobile{
     static String name; //ye final aur static var bana sakte hai ham 
     String showName(){
         return this.name;
     }
}
// 	public static void main(String[] args) {//main method static nahi hua to hame maine class ka obj banakar call 
// 	//karna padega main method ko but main hi to execution point hai program ka so deadlock type
// 		Mobile m1 = new Mobile();
// 		Mobile m2 = new Mobile();
// 		m1.name="Aakash";
// 		System.out.println(m1.showName());
// 			System.out.println(m2.showName());
// 	}
}
