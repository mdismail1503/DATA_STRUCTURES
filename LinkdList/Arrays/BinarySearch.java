import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] a={1,2,3,4,5,6,7};
        int low=0;
        int high=a.length-1;
        int mid=(low+high)/2;
        while(low<=high){
            if(x==a[mid]){
                System.out.println("element found at index "+mid);
                return;
            }
            if(x>a[mid]){
                low=mid+1;
            }
            else if(x<a[mid]){
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        System.out.println("Element not found");
    }
}
