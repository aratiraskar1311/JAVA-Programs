import java.util.*;

class Arithematic
{
    public int iNo;

    public Arithematic(int A)
    {
        iNo = A;
    }
    public boolean CheckPrime()
    {
        int iCnt = 0;
        boolean bFlag = true;

        for(iCnt = 2; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}

class program44
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number :");
        iValue = obj.nextInt(); 

        Arithematic aobj = new Arithematic(iValue);
        bRet = aobj.CheckPrime();

        if(bRet == true)
        {
            System.out.println("Number is prime ");
        }
        else
        {
            System.out.println("Number is not prime ");
        }
    }

}