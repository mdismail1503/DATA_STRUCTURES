import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int[] a = {0, 48, 99, 4, 2, 6, 8, 3, 6, 6, 890, 6, 1, 5, 10};
        int min;
        int x;//minIndex
        for (int i = 0; i < a.length; i++) {
            min = a[i];
            x = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    x = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[x] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
