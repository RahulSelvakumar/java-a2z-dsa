package Sorting;

public class Insertion {
    public static void swap(int x,int y,int arr[]){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void insertionSort(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                swap(j,j-1,arr);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {4,2,5,1,6,3,4,2};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
