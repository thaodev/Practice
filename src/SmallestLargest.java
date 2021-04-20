import java.util.ArrayList;
import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.print("How many integers do you want to input? ");
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.print("Number " + (i+1) + ": ");
            int input = sc.nextInt();

            array.add(input);
        }
        int max = 0;
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (max < array.get(i)) {
                max = array.get(i);
            }
            if (min > array.size()) {
                min = array.get(i);
            }
        }
        System.out.println("Smallest = " + min);
        System.out.println("Largest = " + max);

    }
}
