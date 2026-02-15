/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{    public static int gcd(int a,int b){
    int ans = Math.min(a,b);
for(int i=ans;i>0;i--){
    if(a%i==0&&b%i==0)break;
}
    return ans;
}
	public static void main(String[] args) {
		System.out.println(gcd(10,15));
	}
}
