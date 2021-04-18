import java.util.ArrayList;

public class Mode {
    public static void main(String[] args) {
        int[] array = {12, 10, 10, 24, 15, 12, 50, 89};
        System.out.println(mode(array));

    }


    public static int mode(int[] arr) {
        int[] newArray = new int[101];
        for (int i = 0 ; i < arr.length; i++) {
            newArray[arr[i]] ++;
        }
        int mode = 0;
        int maxCount = 0;
        for(int i = 0 ; i < newArray.length ; i++){
            if(newArray[i] > maxCount) {
                maxCount = newArray[i];
                mode = i;
            }
        }
        return mode;


    }

}
