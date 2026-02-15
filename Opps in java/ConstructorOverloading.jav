public class ConstructorOverloading{
    int rollno;
    double floor;
    //actual paramater is like argument
    //formal parameter is like normal parameter
    //for overloading consrtor
    //1.paramter in number
    //2. type of paramter 
    //3. order of paramter 
    ConstructorOverloading(int r){  
        System.out.println("Thsi is rollno constructor");
        this.rollno=r;
    }
    ConstructorOverloading(){
        System.out.println("This is default ");
        
    }
    ConstructorOverloading(double d ){
        System.out.println("this is double d");
        this.floor=d;
    }
    public void getRoll(){
        System.out.println(this.rollno);
    }
        public void getFloor(){
        System.out.println(this.floor);
    }
}