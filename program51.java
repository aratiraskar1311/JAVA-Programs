
import java.util.*;

class Digit
{
    public int iNo;

    public Digit(int A)
    {
        iNo = A;
    }
    public void DisplayDigit()
    {
        int iDigit = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.println(+iDigit);
            iNo = iNo / 10;
        }
    }
}

class program51
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number :");
        iValue = obj.nextInt();

        Digit dobj = new Digit(iValue);
        dobj.DisplayDigit();
    }
}