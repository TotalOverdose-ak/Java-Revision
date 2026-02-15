import java.util.*;
//Without generics
// class Point {
//     Object x;
//     Object y;
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 	   Point p=new Point();
// 	   p.x=12;
// 	   p.y="AKASH";
// 	   String s = (String)p.x;
// 	}
// }

//with generics
// class Pair<T,S>{
//     T x;
//     S y;
//  }
//   public class Main{
//         public static void main(String args[]){
//           // Pair<Integer,String> p= new Pair<Integer,String>();
//           Pair<Integer,String> p= new Pair<>();
//             p.x=12;
//             p.y="Akash";
//             String s=(String)p.x;
//             System.out.print(p.y+" "+s);
//             }
//     }

//examples 1
// public class Main{
//     public static <T> int count(T arr[],T x){
//         int res=0;
//         for(T e:arr){
//             if(e.equals(x))res++;
//         }
//         return res;
//     }
//     int ar[];
//     ar=new int[];
//   ar[0]=
    
//     public static void main(String args[]){
//         Integer arr[]={10,20,30,40,10};
//         System.out.print(count(arr,10));
//     }
// }
//examples 2
// public class Main{
//     static class MyGen<T>{
//         T x;
//         static int count;
//         MyGen(){
//             count++;
//         }
//     }
//     public static void main(String args[]){
//         MyGen<Integer>m1=new MyGen<>();
//         System.out.println(MyGen.count);
//         MyGen<String>m2=new MyGen<>();
//         System.out.println(MyGen.count);
//         MyGen<Boolean>m3=new MyGen<>();
//         System.out.println(MyGen.count);
//     }
// }
public class Main{
    public static void genevsnongeneEX1(){
        List<Integer>li = new ArrayList<>();  //generics Integer hai and type safety ye compile time par taki pehele hi thik kar sake
        List li1=new ArrayList<>();//non generics and not tpyesfaety   ye run time pr aerror d esakt ahai hume
        li.add(1);
        li.add(7);
        li1.add(2);
        li1.add("Akash");
        li.forEach(item->System.out.println(item));
        li1.forEach(item->System.out.println(item));
    }
    // public static void main(String args[]){
    //   // Main m1=new Main();
    //   // m1.genevsnongeneEX1();
    //     Box b = new Box("Akash");
    //     b.container=2;
    //     System.out.println(b.showAndGet());
    // }
}