import java.util.ArrayList;

class A {
    public static int x = 5;
    public int y = 10;
    public static int sum(){
        int a = 50;
        int sum = a + x;
        return sum;
    }
}


public class StaticPractice {
    public static void main(String[] args) {
        A.x = 20;
        System.out.println(A.x);
        A object = new A();
        object.y = 30;
        A object1 = new A();
        System.out.println(object.y);
        System.out.println(object1.y);
        System.out.print(A.sum());

        ArrayList<Integer> array = new ArrayList<>();
        array.add(23);
        array.add(40);
        array.add(45);
        array.add(-3);
        array.add(90);
        System.out.println("Original data of the array " + array);
        array.remove(2);
        System.out.println("After remove an index 2 " + array);
        array.remove(Integer.valueOf(-3));
        System.out.println("After remove a element has a value of -3 " + array);
    }
}
