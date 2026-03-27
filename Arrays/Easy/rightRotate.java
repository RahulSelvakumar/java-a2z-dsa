package Arrays.Easy;

public class rightRotate {
    public static void main(String[] args) {
        int k=1;
        int arr[]={1,2};
        int n = arr.length;
        k%=n;
        int temp = arr[n-1];
        for(int i=n-1;i>1;i--){
            arr[i]=arr[i-1];
            arr[i-1]=arr[i-2];
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
