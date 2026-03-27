package Arrays.Easy;

public class checkSorted {
    public static void main(String[] args) {
        int arr[]={1,2,8,4,5};
        boolean res=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                res=false;
                break;
            }
        }
        System.out.println(res);
    }
}
