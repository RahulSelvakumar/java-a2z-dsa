package Basics;


public class Pattern {
    public static void pattern1(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print(" ");
            }
            for(int l=0;l<5-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
}

 public static void pattern2(){
        for(int i=1;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<2*5-(2*i+1);k++){
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
}
public static void pattern3(){
    for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void pattern4(){
    for(int i=0;i<5;i++){
        for(int j=1;j<5-i;j++){
            System.out.print("*");
        }
     
       System.out.println();
    }
}
public static void pattern5(){
    for(int i=0;i<5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=1;k<=2*4-2*i;k++){
            System.out.print(" ");
        }
        for(int l=i;l>0;l--){
            System.out.print(l);
        }
        System.out.println();
    }
}

public static void pattern6(){
    int num =1;
    for(int i=0;i<5;i++){
        for(int j=0;j<=i;j++){
            System.out.print((num)+" ");
            num++;
        }
        System.out.println();
    }
}

    public static void main(String args[]){
        // pattern3();
        // pattern4();
        // pattern5();
        pattern6();
    }
}
