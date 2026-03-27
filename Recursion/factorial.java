package Recursion;
public class factorial {
    public static int printFact(int n){
        if(n==1)return 1;
        return n*printFact(n-1);
    }
    public static void main(String[] args) {
       System.out.println( printFact(3));
    }
}
