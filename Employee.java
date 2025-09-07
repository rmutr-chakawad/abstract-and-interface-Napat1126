abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateSalary();

    void showSalary() {
        System.out.println("Name: " + name + ", Salary: " + calculateSalary());
    }
}

