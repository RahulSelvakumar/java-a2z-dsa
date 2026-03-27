package Basics;

import java.util.Scanner;

public class Basics {

     public static Scanner sc = new Scanner(System.in);
    public static void printNumber(){
        int n = sc.nextInt();
        System.out.println(n);
    }

    public static void checkEligibility(){
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Not eligible");
        }
        else{
            System.out.println("Eligible");
        }
    }
    public static void main(String args[]){
        // printNumber();
        checkEligibility();
    }
}
