import java.util.HashMap;
import java.util.Map;

public class Employee {
    int rollNum;
    String name;
    int age;
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4=e3;

        Map<Employee, String> map = new HashMap<Employee, String>();
        map.put(e1, "1");
        map.put(e2, "2");
        map.put(e3, "3");
        map.put(e4, "3");
        System.out.println(map.size());
    }
}
