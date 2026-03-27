package Maths;

public class Paliondrome {
    public static void main(String args[]){
        int n=1221;
        int temp = n;
        int rev=0;
        while(n>0){
            rev= rev*10 + (n%10);
            n/=10;
        }
        System.out.println(rev);
        if(rev==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
