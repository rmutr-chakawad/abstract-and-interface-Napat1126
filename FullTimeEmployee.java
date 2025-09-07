class FullTimeEmployee extends Employee {

    FullTimeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculateSalary() {
        return salary;
    }
}


