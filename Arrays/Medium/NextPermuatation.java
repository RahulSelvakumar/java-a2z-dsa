package Arrays.Medium;

public class NextPermuatation {
    public static void reverse(int arr[],int i,int j){
        while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
        }
    }
    public static void swap(int arr[],int i,int j){
         int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        int breakPoint=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                breakPoint=i;
                break;
        }
        }
        if(breakPoint==-1)reverse(arr,0,arr.length-1);
        for(int i=arr.length-1;i>breakPoint;i--){
            if(arr[i]>arr[breakPoint]){
                swap(arr,i,breakPoint);
                break;
            }
        }
        reverse(arr,breakPoint+1,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
