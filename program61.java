import java.util.*;

class Digit
{
    public int iNo;

    public Digit(int A)
    {
        iNo = A;
    }
    public int CountDigit()
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit > 5)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class program61
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number:");
        iValue = obj.nextInt();

        Digit dobj = new Digit(iValue);
        iRet =dobj.CountDigit();

        System.out.println("count of all digits are :"+iRet);

    }
}

