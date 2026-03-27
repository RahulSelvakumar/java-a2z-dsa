package Recursion;
public class print {
    public static void printUptoN(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printUptoN(++i,n);
    }
    public static void printNameNTimes(int n){
        if(n==0) return;
        System.out.println("Rahul");
        printNameNTimes(n-1);
    }
   public static int sumUptoN(int n){
    if(n==0) return 0;
    return n+sumUptoN(n-1);
   }
    public static void main(String[] args) {
        // printUptoN(1,5);
        // printNameNTimes(5);
        System.out.println(sumUptoN(5));
    }
}
