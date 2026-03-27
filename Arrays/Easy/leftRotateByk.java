package Arrays.Easy;

public class leftRotateByk {
    public static void reverseArr(int arr[],int start, int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=3;
        //brute force
        // // int temp[]=new int[k];
        // for(int i=0;i<k;i++){
        //     temp[i]=arr[i];
        // }
        int n=arr.length;
        // for(int i=k;i<n;i++){
        //     arr[i-k]=arr[i];
        // }
        // for(int i=n-k;i<n;i++){
        //     arr[i]=temp[i-(n-k)];
        // }

        //optimal
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,n-1);
        reverseArr(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
