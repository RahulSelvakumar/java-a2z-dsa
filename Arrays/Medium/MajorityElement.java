package Arrays.Medium;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={7, 0, 0, 1, 7, 7, 2, 7, 7};
        int count=0;
        int el=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                el=arr[i];
                count++;
            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println(el);
        count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==el){
                count++;
            }
        }
        if(count>=Math.floor(arr.length/2)){
            System.out.println(count);
        }
    }
}
