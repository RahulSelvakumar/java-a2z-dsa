package Arrays.Easy;

public class maxSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,2,3,2,1,1,5,2,5};
        int d=3;
        //brute
        // int max=0;
        // for(int i=0;i<arr.length;i++){
            // int sum=0;
            // for(int j=i;j<arr.length;j++){
                // sum+=arr[j];
                // if(sum==d){
                    // max=Math.max(max,j-i+1);
                // }
            // }
        // }
    
        //optimal
        int left=0,right=0;
        int sum=arr[0];
        int len=0;
        while(right<arr.length){
            while( left<=right&&sum>d){
                sum-=arr[left];
                left++;
            }
            if(sum==d){
                len=Math.max(len,right-left+1);
            }
            right++;    
            if(right<arr.length)    {
             sum+=arr[right];
            }
        }

        System.out.println(len);
    }
}
