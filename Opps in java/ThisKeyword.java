//current class ke object ko call karne ke liye use hota hai ye
public class ThisKeyword extends Constructor{
    int rollno;
public ThisKeyword(int r,int r2){
    this.rollno =r;
    super(r2);
    
}
public void akash(int rollno,ThisKeyword ak1){
   rollno=rollno;  //ye to isi local var ko update kar raha hai 
   //2nd try is kya ham rollno ko obj banakr update karne
  // ThisKeyword t = new ThisKeyword();  //ye stack me 103 location par hai 
  // t.rollno=rollno;      // ye sirf t obj ki value change karra let support 103 location ko hi 
  
  //3rd try is like ham obj paramter pass karte
  //ThisKeyword ak=ak1;
  //ak.rollno=rollno;   do do baar main method me obj pass karna pad raha hai par hame 
  
}
public void show(){
    System.out.println("child="+this.rollno+", parent ="+super.rollno);
 
    
}
// public static void main (String[] args) {
//         ThisKeyword t = new ThisKeyword(); //but ye to 101 location par hai 
//     t.akash(7,t); //but is method me hame yaah t t do baar pass karna pad raha hai
// }
}
