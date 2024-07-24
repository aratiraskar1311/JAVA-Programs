
//10   1  2  5            3  4  6 7  8  9 


import java.util.*;

class program207
{
    public static int Difference(int iNo)
    {
        int iCnt = 0;
        int iSumF = 0;
        int iSumN = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) == 0)               //Factor
            {
                iSumF = iSumF + iCnt;
            }
            else                                //Non Factor
            {
                iSumN = iSumN + iCnt;
            }
        }
        return iSumN - iSumF;

    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        iRet = Difference(iValue);
        
        System.out.println("Difference of fators is : "+iRet);
    }
}


