import java.util.Scanner;

public class EmployeeDeductions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        String name = scanner.nextLine();

        String employeeID = "RixDomingo";
        double salary = 0.0;
        double incomeTax = 2500.0;
        double philHealth = 500.0;
        double sss = 1000.0;
        double pagibig = 500.0;

        System.out.print("Enter your current salary: ");
        salary = scanner.nextDouble();
        scanner.nextLine(); 

        double totalDeductions = incomeTax + philHealth + sss + pagibig;
        double netSalary = salary - totalDeductions;

        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Net Salary: " + netSalary);
    }
}
