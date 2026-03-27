package Arrays.Medium;

import java.util.HashMap;

public class countSubarrayWithSumK {
    public static void main(String[] args) {
        int arr[]={3, 1, 2, 4};
        int k=6;
        int count=0;
        int preSum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            preSum+=arr[i];
            int remove=preSum-k;
            if(map.containsKey(remove)){
                count+=map.get(remove);
            }
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        System.out.println(count);
    }
}
