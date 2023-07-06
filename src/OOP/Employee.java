package OOP;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    public double monthSalary;

    public Employee(int id, String firstName, String lastName, double monthSalary){
        this.id = id;
        this.firstName=firstName;
        this.lastName = lastName;
        this.monthSalary = monthSalary;
    }

    public String getName(){
        return (firstName + " " + lastName);
    }

    public Double getAnnualSalary(){
        double annualSalary = 12 * monthSalary;
        return annualSalary;
    }

    public Double raiseSalary(double rate){
        monthSalary = (monthSalary * (rate/100)) + monthSalary;
        return monthSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthSalary=" + monthSalary +
                '}';
    }
}
