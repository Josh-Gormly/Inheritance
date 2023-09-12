import java.util.Scanner;
public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; //Set this to zero length. Loop runs until it isn't.
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while(retString.length() == 0);

        return retString;
    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
            }
            if (pipe.hasNextLine())
            {
                pipe.nextLine();
                return retInt;
            }
        }while(true);
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0;
        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
            }
            if (pipe.hasNextLine())
            {
                pipe.nextLine();
                return retDouble;
            }
        }while(true);
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        do
        {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
            }
            if (pipe.hasNextLine())
            {
                pipe.nextLine();
                return retInt;
            }
            if (retInt >= low && retInt <= high)
            {
                return retInt;
            }
        }while(true);
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble = 0;
        do
        {
            System.out.print("\n" + prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
            }
            if (pipe.hasNextLine())
            {
                pipe.nextLine();
                return retDouble;
            }
            if (retDouble >= low && retDouble <= high)
            {
                return retDouble;
            }
        }while(true);
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String retString = "";
        do {

            System.out.print("\n" + prompt + " [Y/N]: ");
            retString = pipe.nextLine();


        }while(!(retString.equalsIgnoreCase("yes") || retString.equalsIgnoreCase("y")
                || retString.equalsIgnoreCase("no") || retString.equalsIgnoreCase("n")));
        if (retString.equalsIgnoreCase("y") || retString.equalsIgnoreCase("yes"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        boolean getRetString = false;
        do
        {
            System.out.print("\n" + prompt);
            retString = pipe.nextLine();
            if (retString.matches(regEx))
            {
                getRetString = true;
            }
            else
            {
                System.out.println("\n Invalid input: " + retString);
            }
        }while(!getRetString);

        return retString;
    }
}
