package Sorting;

import java.util.ArrayList;

public class mergeSort {
    public static void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid&&right<=high){
            if(arr[right]<=arr[left]){
                temp.add(arr[right]);
                right++;
            }
            else{
                temp.add(arr[left]);
                left++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void mergeSortArr(int arr[],int low,int high){
        if(low>=high)return;
        int mid = (low+high)/2;
        mergeSortArr(arr, low, mid);
        mergeSortArr(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,7,3,2,6,8,1,6,8};
        mergeSortArr(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
