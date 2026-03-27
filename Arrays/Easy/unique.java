package Arrays.Easy;

import java.util.HashMap;

public class unique {
    public static void main(String[] args) {
        //Explanation: In this array, only the element 1 appear once and so it is the answer.
        int arr[]={1,1,2,3,3,4,4};
        //brute
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])){
        //         map.put(arr[i],map.get(arr[i])+1);
        //     }
        //     else{
        //         map.put(arr[i],1);
        //     }
        // }
        // for(int key:map.keySet()){
        //     if(map.get(key)==1){
        //         System.out.println(key);
        //     }
        // }

        //optimal using xor
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor ^=arr[i];
        }
        System.out.println(xor);
        
    }
}
