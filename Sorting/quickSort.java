package Sorting;

public class quickSort {
    public static int sort(int arr[],int low, int high){
        int pivot= arr[low];
        int i=low;
        int j=high;
        while(i<j){
        while(arr[i]<=pivot&&i<high){
            i++;
        }
        while(arr[j]>pivot&&j>low){
            j--;
        }
        if(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quickSortarr(int arr[],int low,int high){
        if(low>=high)return;
        int partition = sort(arr,low,high);
        quickSortarr(arr, low, partition-1);
        quickSortarr(arr, partition+1, high);
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,2,5,6,7,2,6};
        quickSortarr(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
