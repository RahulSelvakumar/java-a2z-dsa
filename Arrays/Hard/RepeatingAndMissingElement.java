package Arrays.Hard;

public class RepeatingAndMissingElement {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,5};
        int n=arr.length;
        int sum=0;
        int sum2=0;
        int sumN=n*(n+1)/2;
        int sum2N=n*(n+1)*(2*n+1)/6;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            sum2+=arr[i]*arr[i];
        }
        int val1=sumN-sum;
        int val2=sum2N-sum2;
        val2=val2/val1;
        int x=(val1+val2)/2;
        int y=x-val1;
        System.out.print(x+" "+y);
    }
}
