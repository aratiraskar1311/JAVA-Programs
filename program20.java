
import java.util.*;

class program20
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }

    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number you want to display :");
        iValue = obj.nextInt();

        Display(iValue);

    }
}