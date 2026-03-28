package Arrays.Hard;

import java.util.HashMap;

public class LongestSubarryWithSumZero {
    public static void main(String[] args) {
        int arr[]={9,-3,3,-1,6,-5};
        int max=0;
        int preSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
                preSum+=arr[i];
                if(preSum==0)max=i+1;
                else{
                if(map.containsKey(preSum)){
                    max=Math.max(max, i-map.get(preSum));
                }
                else{
                    map.put(preSum,i);//6,
                }
            }
            }
        System.out.println(max);
    }
}
