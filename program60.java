
import java.util.*;

class Digit
{
    public int iNo;

    public Digit(int A)
    {
        iNo = A;
    }
    public int CountOddDigit()
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
            
        }
        return iCount;
        
    }
}

class program60
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number :");
        iValue = obj.nextInt();

        Digit dobj = new Digit(iValue);
        iRet = dobj.CountOddDigit();

        System.out.println("Count all oll digits are : "+iRet);
    }
}