public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("Иванов Иван Иванович" + i, 1 + (i % 5), 10000 * (i + 1));
        }

        System.out.println("a. Все сотрудники: ");
        printEmployees();

        System.out.println("b. Сумма затрат на зарплаты в месяц = " + calculateTotalSalary());

        System.out.println("c. Сотрудник с минимальной зарплатой = " + getEmployeeWithMinSalary());

        System.out.println("d. Сотрудник с максимальной зарплатой = " + getEmployeeWithMaxSalary());

        System.out.println("e. Средняя значение зарплат = " + calculateAverageSalary());

        System.out.println("f. Ф.И.О сотрудников: ");
        printFullName();

    }

    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    private static Employee getEmployeeWithMinSalary() {
        Employee result = employees[0];

        for (Employee employee : employees) {
            if (result.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }

    private static Employee getEmployeeWithMaxSalary() {
        Employee result = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }

    private static double calculateAverageSalary() {
        int totalSalary = calculateTotalSalary();
        return (double) totalSalary / employees.length;
    }

    private static void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


}