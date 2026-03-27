package Maths;

public class primeNumber {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
            if(n/i != i){
                count++;
            }
        }
        }
        System.out.println(count);
        if(count==2){
            System.out.println("prime");
        }
    }
}
