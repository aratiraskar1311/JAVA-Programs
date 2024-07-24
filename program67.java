import java.util.*;


class Pattern
{
    public int iNo;

    public Pattern(int A)
    {
        iNo = A;
    }
    public void DisplayPattern()
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(" "+iCnt);
        }
    }
}

class program67
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number:");
        iValue =obj.nextInt();

        Pattern pobj = new Pattern(iValue);
        pobj.DisplayPattern();


    }
}