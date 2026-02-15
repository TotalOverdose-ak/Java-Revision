//used to intizlize data of an object 
//similar to the function hote hai VerifyError
//nahito without constructor    s1.studentName = "akash"; issa karna padta hai
//constructor name = class name Runnable
//consrutctor does not return data not even void 
//public constructor name thats it () then parameter do ya mat do 
//default constructor cretae karta hai java agar koi nahi bana hai to class ka default wala 
//par ahar ek bhi bana diya tumne to nahi banayega java  comstructor
public class Constructor{
    int rollno;
    Constructor(int r){
        this.rollno=r;
    }
    public void getRoll(){
        System.out.println(this.rollno);
    }
}
