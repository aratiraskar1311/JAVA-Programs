
import java.util.*;

class Digit
{
    public int iNo;

    public Digit(int A)
    {
        iNo = A;
    }
    public void DisplayOddDigit()
    {
        int iDigit = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
            {
                System.out.println(+iDigit);
            }
            iNo = iNo / 10;
            
        }
        
    }
}

class program59
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number :");
        iValue = obj.nextInt();

        Digit dobj = new Digit(iValue);
        dobj.DisplayOddDigit();

    }
}