import java.util.ArrayList;

abstract class Staff {
    private String name;
    private int age;


    public Staff() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getGender();


}
class Employee extends Staff {
    private String gender;

    public Employee(String gender) {
        super();
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString() {
        return String.format("%-20s%-20s%-10s", "Employee Name", "Employee Age", "Employee Gender");
    }
}


public class ConstructorInheritance {
    public static void main(String[] args) {
        ArrayList<Staff> staffs = new ArrayList<>();
        Staff employee1 = new Employee("female");
        employee1.setName("Rachel Green");
        employee1.setAge(30);
        staffs.add(employee1);
        System.out.println(employee1);
        for (Staff e : staffs) {
            //System.out.println(e.toString());
            System.out.println(String.format("%-20s%-20s%-10s", e.getName(), e.getAge(), e.getGender()));
        }

    }
}
