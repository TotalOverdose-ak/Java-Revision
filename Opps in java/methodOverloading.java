//multiple methods of same name in one class i.e same class
public class methodOverloading{
   
    int rollno;
    methodOverloading(int r){
        this.rollno=r;
    }
    public void getRoll(){
        System.out.println(this.rollno);
    }
    public void getRoll(int c){
        
    }
    public void getRoll(double c){
        
    }


}