import java.util.*;

class Arithematic
{
    public int iNo;

    public Arithematic(int A)
    {
        iNo = A;
    }
    public int Factorial()
    {
        int iCnt = 0;
        int iMult = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iMult = iMult * iCnt;
        }
        return iMult;
    }
    
}

class program46
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iValue = obj.nextInt();

        Arithematic aobj = new Arithematic(iValue);
        iRet = aobj.Factorial();

        System.out.println("Factorial is :"+iRet);
    }
}