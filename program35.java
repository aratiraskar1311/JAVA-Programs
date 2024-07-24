import java.util.*;

class Arithematic
{   
    public int iNo;

    public Arithematic(int A)
    {
        iNo = A;
    }
    public int SumFactor()
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt =1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

}

class program35
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iValue = obj.nextInt();

        Arithematic aobj = new Arithematic(iValue);
        iRet = aobj.SumFactor();

        System.out.println("Summation of factor is "+iRet);
    }
}