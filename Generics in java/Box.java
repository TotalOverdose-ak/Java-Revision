public class Box{  //without generics
//this program is not typesafe 
    Object container;
    Box(Object c){
        this.container=c;
    }
    public  Object showAndGet(){
        return this.container;
    }
}