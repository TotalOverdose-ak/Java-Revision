/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.util.stream.Stream;
public class Main


{   public static double avg(int arr[]){
    double avg=Arrays.stream(arr)
    .average().getAsDouble();
    return avg;
}
    public static int sum(int arr[]){
        int sum=Arrays.stream(arr)
        .sum();
        return sum;
        
    }
    public static int max(int arr[]){
        int maxx=Arrays.stream(arr).max().getAsInt();
        return maxx;
    }
    public static void naturalNumber(int n){
       Stream.iterate(1, x -> x + 1)
       .filter(x->x.toString().contains("1"))
        .limit(n)
        .forEach(System.out::print);
    }
    public static void startAndEnds(String arr[]){
         Arrays.stream(arr)
         .filter(x->x.startsWith("a"))
         .filter(x->x.endsWith("h"))
         .sorted()
         .forEach(System.out::print);
    }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Sum "+sum(arr));
			System.out.println("Average "+avg(arr));
				System.out.println("Max "+max(arr));
				naturalNumber(10);
			System.out.println();
				String s[]={"akash","keote"};
				startAndEnds(s);
	}
}