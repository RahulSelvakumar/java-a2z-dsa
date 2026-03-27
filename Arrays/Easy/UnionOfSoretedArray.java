package Arrays.Easy;

import java.util.ArrayList;

public class UnionOfSoretedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,4,5,6};
        int arr2[]={1,1,2,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                if(list.isEmpty()||list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }
            else{
                if(list.isEmpty()||list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr1.length){
 if(list.isEmpty()||list.get(list.size()-1)!=arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
        }
        while(j<arr2.length){
if(list.isEmpty()||list.get(list.size()-1)!=arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
        }
        System.out.println(list);
    }
}
