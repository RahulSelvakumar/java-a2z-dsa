package Arrays.Medium;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {5, -2, 3, -10, 4};
        int sum=0;
        int max=Integer.MIN_VALUE;
        int start=0;
        int ansStart=-1,ansEnd=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0){start=i;}
            sum+=arr[i];
            if(sum>max){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("Max Sum: " + max);
        System.out.println("Subarray indices: " + start + " to " + ansEnd);

        System.out.print("Subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
