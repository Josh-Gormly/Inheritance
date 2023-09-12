import java.util.ArrayList;
public class InheritanceDemo
{
    public static void main(String[] args)
    {
        Worker workerOne = new Worker("000001", "Joshua", "Gormly", "Mr.", 2002, 17.50);
        Worker workerTwo = new Worker("000002", "John", "Gormly", "Mr.", 1978, 85.00);
        Worker workerThree = new Worker("000003", "Adam", "Doe", "Mr.", 1997, 23.0);

        SalaryWorker salaryWorkerOne = new SalaryWorker("000001", "Alexa", "Ramsey", "Mrs.", 2004, 15.00, 20000);
        SalaryWorker salaryWorkerTwo = new SalaryWorker("000002", "David", "Smith", "Mr.", 1995, 50.00, 102000);
        SalaryWorker salaryWorkerThree = new SalaryWorker("000003", "Tyler", "Votto", "Mr.", 1989, 96.00, 321000);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(workerOne);
        workers.add(workerTwo);
        workers.add(workerThree);
        workers.add(salaryWorkerOne);
        workers.add(salaryWorkerTwo);
        workers.add(salaryWorkerThree);

        String headerOne = "Name";
        String headerTwo = "Week One";
        String headerThree = "Week Two";
        String headerFour = "Week Three";

        System.out.println();
        System.out.println("Week One Pay Per Worker");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-20s%-15s%-15s%-15s", headerOne, headerTwo, headerThree, headerFour);
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        for(Worker i : workers)
        {
            System.out.printf("\n%-20s%-15.2f%-15.2f%-15.2f", i.getFullName(), i.calculateWeeklyPay(40),
                    i.calculateWeeklyPay(50), i.calculateWeeklyPay(40));
        }
    }
}