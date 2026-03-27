package Maths;

public class GCD {
    public static void main(String[] args) {
        int n1= 9;
        int n2 = 36;
        int gcd =0;
        // for(int i=Math.min(n1,n2);i>1;i--){
        //     if(n1%i==0 && n2%i==0){
        //         gcd = i;
        //         break;
        //     }
        // }
        // System.out.println(gcd);

        while(n1>0 && n2>0){
            if(n1>n2){n1=n1%n2;}
            else{ n2=n2%n1;}
        }
        if(n1==0){System.out.println(n2);}
        else{System.out.println(n1);}
    }
}
