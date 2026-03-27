package Arrays.Easy;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,3,4,5,6};
        int arr2[]={2,3,3,4};
        ArrayList<Integer> list=new ArrayList<>();
        
        //brute
        // int visited[]=new int[arr2.length];
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr2.length;j++){
        //         if(arr1[i]<arr2[j]){
        //             break;
        //         }
        //         if(arr1[i]==arr2[j]&&visited[j]==0){
        //             list.add(arr1[i]);
        //             visited[j]=1;
        //             break;
        //         }
        //     }
        // }

        //optimal

        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }
}
