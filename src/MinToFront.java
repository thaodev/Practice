import java.util.ArrayList;

public class MinToFront {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0, 13);
        arr.add(1, 24);
        arr.add(2, -10);
        arr.add(3, 20);
        arr.add(100);
        System.out.println("Array before min to front is: " + arr);
        minToFrontV2(arr);
    }
    /*public static void minToFront(ArrayList<Integer> array) {
        int min = array.get(0);
        for (Integer integer : array) {
            if (integer < min) {
                min = integer;
                array.remove(Integer.valueOf(integer));
            }
        }
        array.add(0, min);
        System.out.println("Array after min to front is " + array);
    }*/

    public static void minToFrontV2(ArrayList<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
                array.remove(array.get(i));
            }
        }
        array.add(0, min);
        System.out.println("Array after min to front is " + array);
    }

}
