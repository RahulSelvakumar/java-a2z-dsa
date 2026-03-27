package Maths;

public class Amstrong {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        while(n>0){
            sum = sum + (int)Math.pow(n%10,3 );
            n/=10;
        }
        System.out.println(sum);
    }
}
