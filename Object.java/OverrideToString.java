public class OverrideToString{
      String model;
      int price;
OverrideToString(){
    this.model="Lenevo";
    this.price=1000;
}
    public String toString() {
        return model + " : " + price;
    }
   /* public static void main (String[] args) {
        OverrideToString obj = new OverrideToString();
        System.out.println(obj);//op   Lenevo : 1000     it prints custom data 
        //Superclass wala toString() call nahi hota
    }      */
}