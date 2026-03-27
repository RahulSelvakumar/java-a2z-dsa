package Arrays.Easy;

public class Movezeros {
    public static void main(String[] args) {
        int arr[]={1,0,1,2,1,0,1,2,3};
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;    
            }
        }
        
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}   
