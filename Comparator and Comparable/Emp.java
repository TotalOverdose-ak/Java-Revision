public class Emp{
    private String name;
    private String phone;
    private int empId;
    
    Emp(String n,String p,int e){
        this.name=n;
        this.phone=p;
        this.empId=e;
    }
    //comparable logic
    //for integre
    //ek baar me ek hi logic kam karega comparable me 
    //single parameter leta hai ye apne object ko given object ko 
    //compare karta hai 
    //java.util.comparator 
    //java.lang.comparable
    @Override
    public int compareTo(Emp o){
        return this.empId-o.empId;
        
    }
    //for string
    @Override
    public int compareTo(Emp o){
        return this.name.compareTo(o.name);
        
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public int getEmpId(){
        return empId; 
    }
    @Override
    public String toString() {
        return "Emp [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
    }
    
}