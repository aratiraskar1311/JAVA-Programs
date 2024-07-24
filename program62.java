import java.util.*;

class Digit
{
    public int iNo;

    public Digit(int A)
    {
        iNo = A;
    }
    public int SumDigits()
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class program62
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iValue = obj.nextInt();

        Digit dobj = new Digit(iValue);
        iRet = dobj.SumDigits();

        System.out.println("Sum of all digits are :"+iRet);
    }
}