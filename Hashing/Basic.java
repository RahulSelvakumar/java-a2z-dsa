package Hashing;

import java.util.HashMap;

public class Basic{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[] = {1,2,6,5,3,2,5,2,4,8,6,2,4,1,6,3,6,7,9,5,2,4,2,8};
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        int max= -1;
        int min = -1;
        int minEle = 0;
        int maxEle= 0;
        for(int i: map.keySet()){
            int freq = map.get(i);
            if(freq<min){
                min = freq;
                minEle = i;
            }
            if(freq>max){
                max = freq;
                maxEle = i;
            }
        }
        System.out.println("max freq: "+maxEle);
        System.out.println("min freq: "+minEle);
    }
}