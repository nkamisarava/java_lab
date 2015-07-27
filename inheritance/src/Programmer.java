import java.text.SimpleDateFormat;
import java.util.Date;

public class Programmer extends Employee {

    int bonus = 1000;

    public Programmer(float salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    void work() {
        System.out.println("work as programmer");
    }

    public void getFired(String date) {
        super.getFired(date);
    }

    public static void main(String args[]) {
        Date day = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Programmer p = new Programmer(1500,500);
        p.setName("Mark Brown");
        System.out.println(p.getName());
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is: " + p.bonus);
        p.work();
        p.getFired(sdf.format(day));
    }
}
