import java.util.*;
class Main{ 
public static void main (String[] args) {
    /* code */
    ArrayList<Integer>ar = new ArrayList<>();
    ar.add(10);  //integer ke object hai ye autoboxing hui hai yaha primitive nahi hai
    ar.add(11);
    Collections.sort(ar); //yaha sort hamne simply integer ko kiya hai integer wale obj ko
    //but agar hamare pass custom object hai to unko kaise sort karte ham 
    //compartor and comparable use hoga
    System.out.println(ar);
    ArrayList<Emp> e = new ArrayList<>();
   e.add( new Emp("Akash","12345",12));
   e.add (new Emp("Jay","1111",11));
    e.add(new Emp("Bhavesh","4444",1));
    System.out.println(e);   //hashcode ayega agar data hona to toString() override
    //ye collections.sort se sort nahi hoga java confusse hoga yaha par knose member fun ke acc sort karna hai 
    //compartor multiple logic ke acc sort
    //comparable single var ke accoding logic 
    //comaprable ek interface hai uske aage implement karna padta hai class
    //Emp implements Comparable <Emp> // <> nhi diya to bhi chakega 
    //fprce kara compraeTo method se override karo 
    
    //comparator multiple logic ke liye 
    Collections.sort(e,new IdComparator());
    System.out.println(e);
    ArrayList<Emp> emp=new ArrayList<>();
    Collections.sort(emp,new NameComparator());
}
}