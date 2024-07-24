import java.util.*;

class Arithematic
{
    public int iNo;

    public Arithematic(int A)
    {
        iNo = A;
    }
    public int CountFactor()
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iCount++;
            }
            
        }
        return iCount;
    }
    
}

class program37
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter the number :");
        iValue = obj.nextInt();

        Arithematic aobj = new Arithematic(iValue);
        iRet = aobj.CountFactor();

        System.out.println("Count total number of factors are :"+iRet);
    }

}