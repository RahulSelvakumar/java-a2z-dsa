package Recursion;
public class fibonnaci {
    public static int printfibo(int n){
        if(n<=1)return n;
        return printfibo(n-1)+printfibo(n-2);
    }

    public static void main(String args[]){
        System.out.println(printfibo(4));
    }
}
