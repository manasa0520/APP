package Week6;

public class Employee {
    public String name_010;
    private double salary_010;

    public Employee(String name_010, double salary_010) {
        this.name_010 = name_010;
        this.salary_010 = salary_010;
    }
    public void work() {
        System.out.println(name_010 + " is working.");
    }
    public double getSalary() {
        return salary_010;
    }
}
class HRManager extends Employee {
    public HRManager(String name_010, double salary_010) {
        super(name_010, salary_010);
    }
    @Override
    public void work() {
        System.out.println(name_010 + " is managing HR tasks.");
    }
    public void addEmployee(String employeeName) {
        System.out.println(name_010 + " is adding a new employee: " + employeeName);
    }
    public static void main(String[] args) {
        HRManager hrManager = new HRManager("Kiran", 76000);
        hrManager.work();
        System.out.println("Salary: $" + hrManager.getSalary());
        hrManager.addEmployee("Mani");
    }
}

