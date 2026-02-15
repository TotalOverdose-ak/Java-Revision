public class Student{
    int rollno;
    String name;
    Student(int r,String n){
        this.rollno=r;
        this.name=n;
    }
    public void show(){
        System.out.println(rollno);
        System.out.println(name);
    }
}
