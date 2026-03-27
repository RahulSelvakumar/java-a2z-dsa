package Sorting;

public class Selection {
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String args[]){
        int arr[]={3,5,7,1,23,45,12,89,43};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
