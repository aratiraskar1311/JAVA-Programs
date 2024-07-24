
import java.util.*;

class Arithematic
{
    public int iNo;

    public Arithematic(int A)
    {
        iNo = A;
    }
    public boolean CheckPerfect()
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class program41
{
    
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        boolean iRet = false;

        System.out.println("Enter the number :");
        iValue = obj.nextInt();

        Arithematic aobj = new Arithematic(iValue);
        iRet = aobj.CheckPerfect();

        if(iRet == true)
        {
            System.out.println("Number is perfect ");
        }
        else
        {
            System.out.println("Number is not perfect ");
        }
        

    }
}