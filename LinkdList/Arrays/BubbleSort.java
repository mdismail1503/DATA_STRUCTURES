import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={4,2,6,8,3,6,6,890,6,1,5,10};
        int n=0;
        while(n<arr.length-1){
            for(int j=0;j<arr.length-n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
            n++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
