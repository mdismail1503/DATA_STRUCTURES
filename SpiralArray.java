import java.util.ArrayList;
import java.util.List;

public class SpiralArray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8}};
        int top=0;
        int down=arr.length-1;
        int left=0;
        int right=arr[0].length-1;
        int d=0;
        List<Integer> list=new ArrayList<>();
        while(top<=down && left<=right){
            if(d==0){
                for(int i=left;i<=right;i++){
                    list.add(arr[top][i]);}
                top+=1;
            }

            else if(d==1){
                for(int i=top;i<=down;i++){
                    list.add(arr[i][right]);
                }
                right-=1;
            }
            else if(d==2){
                for(int i=right;i>=left;i--){
                    list.add(arr[down][i]);
                }
                down-=1;

            }
            else if(d==3){
                for(int i=down;i>=top;i--)
                    list.add(arr[i][left]);
                left+=1;
            }
            d=(d+1)%arr[0].length;
        }
        System.out.println(list);
    }
}
