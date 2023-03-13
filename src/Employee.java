public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private int id;
    private static int counter;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Сотрудник " + id +
                ": полное имя='" + fullName + '\'' +
                ", отдел=" + department +
                ", зарплата=" + salary;
    }
}

