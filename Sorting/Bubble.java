package Sorting;

public class Bubble {
    public static void swap(int x,int y,int arr[]){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=n-1;i>0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(j,j+1,arr);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,2,5,1,6,3,4,2};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
