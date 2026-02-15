/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/


public static void main (String[] args) {
    Student s1 = new Student(7,"akash");
    EnggStudent s2 = new EnggStudent(8,"jay");
    s1=s2;
    s1.show();
    ArrayList<? extends Student> ar1 =new ArrayList<>();
    ArrayList<EnggStudent>ar2=new ArrayList<>();
    ar1=ar2;
    
    
}