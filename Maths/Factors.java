package Maths;

import java.util.ArrayList;
import java.util.List;

public class Factors {
    public static void main(String args[]){
        int n=36;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
            if(n/i!=i){
                list.add(n/i);
            }
        }
        }
        System.out.println(list);
    }
}
