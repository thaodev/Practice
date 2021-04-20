import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumbersEnter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        array.add("My");
        array.add("Name");
        array.add("is");
        array.add("Rachel");
        array.add("Thi");
        array.add("Nguyen");
        System.out.println("Array before being deleted an element: " + array);
        System.out.println("What string do you want to delete? ");
        String deleteElement = sc.next();

        array.remove(String.valueOf(deleteElement));
        System.out.println("Array after being deleted an element: " + array);

    }
}
