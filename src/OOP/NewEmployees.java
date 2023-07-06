package OOP;

public class NewEmployees {
    public static void main(String[] args) {
        Employee alexandra = new Employee(01, "Alexandra", "Petrova", 1200);
        System.out.println("Employee names: " + alexandra.getName());
        System.out.println("Employee's annual salary: " + alexandra.getAnnualSalary());
        System.out.println("Employee's monthly salary with raise: " + alexandra.raiseSalary(12.5));
        System.out.println("Employee's annual salary after raise: " + alexandra.getAnnualSalary());
        System.out.println("Employee's profile: " + alexandra.toString());
    }
}
