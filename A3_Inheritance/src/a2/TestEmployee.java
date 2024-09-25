package a2;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Arpit", 50000, 2020, "AB123456C");

        // Print details of the Employee
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

        employee.setAnnualSalary(55000);
        employee.setYearStarted(2021);

        System.out.println("\nUpdated Employee Details:");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: $" + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
