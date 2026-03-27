package Arrays.Medium;

import java.util.HashSet;

public class LongestConseqArray {
    public static void main(String[] args) {
        int arr[]={10,4,200,1,2,3};
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int x=0;
        int max=1;
        for(int i=0;i<set.size();i++){
            if(!set.contains(i-1)){
                x=i;
                int count=1;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                max=Math.max(max,count);
            }
        }
        System.out.println(max-1);
    }
}
