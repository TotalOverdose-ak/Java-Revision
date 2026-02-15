public class Inheritance extends Object{
    //yaha Interfacee class by default Object ko extends karra hia 
    // super() Parent class by default all class call this method first 
    
    //Har class automatically java.lang.Object ko extend karti hai

//Agar tum nahi likhte tab bhi compiler internally likh deta ha
  Inheritance() { 
      super();
      System.out.println("parent default");
  }
    Inheritance(int n) { 
     // super(n); //Object(n)
     this();//java ek time par ek hi parent contructor call karta hai ek child mese 
     //sath hi ya to current defaulty ya to parent dono mese ek ko hi kar sakta hai 
      System.out.println("parent int");
  }
   public int add(int a,int b){
       
       return a+b;
   }
   public int sub(int a,int b){
       return  a-b;
   }
}