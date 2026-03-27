package Arrays.Medium;

import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        int target=7;
        //brute
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         if(arr[i]+arr[j]==sum){
        //             System.out.println("Yes");
        //         }
        //     }
        // }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int x = target-arr[i];
            if(map.containsKey(x)){
                System.out.println(map.get(x)+" "+i);
            }
            else{
                map.put(arr[i],i);
            }
        }
    }
}
