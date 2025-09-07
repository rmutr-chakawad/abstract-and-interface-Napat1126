public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Somchai", 30000);
        Employee emp2 = new ContractEmployee("Somsri", 160, 200);

        emp1.showSalary();
        emp2.showSalary();

        double total = emp1.calculateSalary() + emp2.calculateSalary();
        System.out.println("Total Salary: " + total);
    }
}
