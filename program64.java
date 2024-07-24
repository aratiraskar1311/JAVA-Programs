import java.util.*;

class Digit
{
    public int iNo;

    public Digit(int A)
    {
        iNo = A;
    }
    public int SumOddDigit()
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
            {
                iSum = iSum + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSum;
    }
}

class program64
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iValue = obj.nextInt();

        Digit dobj = new Digit(iValue);
        iRet = dobj.SumOddDigit();

        System.out.println("Sum of all odd digits are :"+iRet);

    }

}