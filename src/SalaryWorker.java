import java.util.ArrayList;
public class SalaryWorker extends Worker
{
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, yearOfBirth, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return String.format("%.2f", weeklyPay);
    }

}
