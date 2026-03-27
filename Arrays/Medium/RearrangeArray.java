package Arrays.Medium;

public class RearrangeArray {
    public static void main(String[] args) {
        int arr[]={-1,2,1,2,-2,-3,4};
        int ans[]=new int[arr.length];
        int pos=0;int neg=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                neg+=2;
                ans[neg]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
