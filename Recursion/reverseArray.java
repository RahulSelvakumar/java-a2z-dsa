package Recursion;
public class reverseArray {
    public static void swap(int x, int y ,int arr[]){
        arr[x] += arr[y];
        arr[y] =arr[x]-arr[y];
        arr[x] -=arr[y]; 
    }
    public static void printrev(int start,int arr[]){
        if(start>=arr.length/2) return;
        swap(start,arr.length-start-1,arr);
        printrev(++start, arr);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        printrev(0,arr);
        for(int i=0;i<4;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
