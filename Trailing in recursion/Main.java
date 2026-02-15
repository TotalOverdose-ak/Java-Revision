/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static int fac(int n,int k){
        if(n==0||n==1)return k;
     
        return fac(n-1,k*n);
      
    }
    static int fib(int n,int k1,int k2){
        if(n==1||n==0)return k2;
        return fib(n-1,k2,k1+k2);
    }
    static int getSum(int n){
        if(n==1)return 1;
        return n+getSum(n-1);
    }
	public static void main(String[] args) {
	int fact=fac(5,1);
System.out.println(fact);
	int fibb=fib(7,0,1);
System.out.println(fibb);
int naturalNoFirst=getSum(5);
System.out.println(naturalNoFirst);
	}
}
