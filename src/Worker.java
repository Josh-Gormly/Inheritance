
public class Worker extends Person
{
    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int yearOfBirth, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double totalPay = hourlyPayRate * hoursWorked;
        if (hoursWorked > 40)
        {
            totalPay = hourlyPayRate * 40 + (hourlyPayRate * 1.5) * (hoursWorked - 40);
        }
        else
        {
            totalPay = hourlyPayRate * hoursWorked;
        }
        return totalPay;
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        double regularHours;
        double overtimeHours;
        double regularPay;
        double overtimePay;
        double totalPay;
        String weeklyPay;
        String totalPayDisplay;

        if (hoursWorked > 40)
        {
            regularHours = 40;
            overtimeHours = hoursWorked - 40;
        }
        else
        {
            regularHours = hoursWorked;
            overtimeHours = 0;
        }

        regularPay = regularHours * hourlyPayRate;
        overtimePay = overtimeHours + (hourlyPayRate * 1.5);
        totalPay = regularPay + overtimePay;
        weeklyPay = "Regular Pay Hours: " + regularHours + "\nRegular Pay: $" + regularPay + "\nOvertime Pay Hours: " + overtimeHours +
                "\nOvertime Pay: $" + overtimePay + "Total Pay: $" + totalPay;

        totalPayDisplay = String.format("%.2f", totalPay);

        return totalPayDisplay;
    }
}
