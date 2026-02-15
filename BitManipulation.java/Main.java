class Main{
    public static boolean SetBit(int n,int k){
        return (((n>>k)&1)==1) ? true: false;
    }
    public static int calSetBit(int n){
        int cnt=0;
        for(int i=0;i<32;i++){
            if(SetBit(n,i))cnt++;
        }
        return cnt;
    }
    public static int countSetBits(int n) {
        // code here
        int cnt=0;
        for(int i=1;i<=n;i++){
           cnt+=calSetBit(i);
        }
        return cnt;
        
    }
    public static void main(String args[]){
        System.out.println(5&6);
          System.out.println(5|6);
            System.out.println(5^6);
              System.out.println(~5);
                System.out.println(~6);
                  System.out.println(5>>2);
                    System.out.println(32>>2);
                   if((3&1)==0)System.out.println("even");
                   else System.out.println("odd");
                   System.out.println(countSetBits(17));
                
    }
}