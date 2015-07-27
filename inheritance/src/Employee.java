
public class Employee {

    String name;
    float salary = 2000;

    public Employee(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void work() {
        System.out.println("work as usual");
    }

    void getFired(String date) {
        System.out.println("become fired " + date);
    }
}
