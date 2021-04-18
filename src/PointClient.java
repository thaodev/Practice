class Encapsulation {
    private static int x1 = 50;
    private int y1 = 40;
    public Encapsulation() {
        this.x1 = x1;
        this.y1 = y1;
    }

    public static int getX1() {
        return x1;
    }

    public static void setX1(int x1) {
        Encapsulation.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }
}

public class PointClient {
    public int z1 = 20;
    public static int z2 = 10;
    public static void main(String[] args) {
        System.out.println(Encapsulation.getX1() + z2);
        Encapsulation object_new = new Encapsulation();
        System.out.println(object_new.getY1());
    }
}
