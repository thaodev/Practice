import java.util.Arrays;

public class kthLargest {
    public static void main(String[] args) {
        int[] arr = {12, 31, 0, 12, 56, 48, 96, 100 , 500, 501};

        System.out.println(kthLargest(5, arr));

    }
    public static int kthLargest(int k, int[] a) {
        int temp = 0;
        for (int i = 0 ; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        return a[k];
    }
}
