import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int[] bb={4,3,2,15,6,7,9,8};
        int no=(int) Math.ceil(Math.sqrt(bb.length));
        int max=Integer.MAX_VALUE;
        for(int val:bb)
        {
            if(val>max){
                max=val;
            }
        }

        //we take arrayLists in an array..
        ArrayList[] buckets=new ArrayList[no];
        for(int i=0;i<buckets.length;i++)
        {
            buckets[i]=new ArrayList<Integer>();
        }

        //
        for(int val:bb)
        {
            int bucketNo=(int) Math.ceil((float) (val*no)/(float)max);
            buckets[bucketNo-1].add(val);
        }
        System.out.println(Arrays.toString(buckets));

//

        for(ArrayList<Integer> bucket:buckets)
        {
            Collections.sort(bucket);
        }
        System.out.println(Arrays.toString(buckets));

        //
        int index=0;
        for(ArrayList<Integer> bucket:buckets)
        {
            for(int value:bucket){
                bb[index++]=value;
            }
        }

        System.out.println(Arrays.toString(bb));

    }
}
