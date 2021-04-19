import java.util.ArrayList;

public class SwapPairs {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        //String[] arrayString = {"Hello", "The", "World", "I'm", "learning", "coding"};
        array.add("four");
        array.add("score");
        array.add("and");
        array.add("seven");
        array.add("years");
        doubleList(array);
        swapPairs(array);
        removeEvenLength(array);
        //removeOddLength(arrayString);


    }
    public static void swapPairs(ArrayList<String> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            String temp = arr.get(2*i+1);
            arr.set(2*i+1, arr.get(2*i) );
            arr.set(2*i, temp);
        }
        System.out.println(arr);
    }

    public static void removeEvenLength(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() % 2 == 0) {
                arr.remove(arr.get(i));
            }
        }
        System.out.println(arr);
    }

    public static void doubleList(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.add(i+1,arr.get(i));
            i++;
        }
        System.out.println(arr);
    }

    /*public static void removeOddLength(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() % 2 != 0) {
                array[i].trim();
            }
        }
        System.out.println(Arrays.toString(array));
    }*/
}
