package Arrays.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]= {1,3,4,6,2,6};
        int max=-1;
        int smax=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }
            if(smax<arr[i]&& arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max+" "+smax);
    }
}
