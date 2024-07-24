import java.util.*;

class Digit
{
    public int iNo;

    public Digit(int A)
    {
        iNo = A;
    }
    public int ReverseDigit()
    {
        int iDigit = 0;
        int iRev = 0;

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }
}

class program65
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the value :");
        iValue = obj.nextInt();

        Digit dobj = new Digit(iValue);
        iRet =dobj.ReverseDigit();

        System.out.println("Reverse number is:"+iRet);
    }
}