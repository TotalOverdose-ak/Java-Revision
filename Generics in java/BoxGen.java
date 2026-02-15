public class BoxGen<T>{
    T container;
    BoxGen(T c){
        this.container=c;
    }
    public T showGen(){
        return this.container;
    }
    public void performSomeTask(){
        if(container instanceof String){
            System.out.println("length of "+container+"is "+((String)container).length());
        }
        else if(container instanceof Integer){
            System.out.println("length of "+container );
}
}
}