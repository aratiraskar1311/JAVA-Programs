
import java.util.*;

class Arithematic
{
    public int iNo;

    public Arithematic(int A)
    {
        iNo = A;
    }
    public boolean EvenOdd()
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class program8
{
    
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        {
            int iValue = 0;
            boolean bRet = false;

            System.out.println("Enter the number : ");
            iValue = obj.nextInt();

            Arithematic aobj = new Arithematic(iValue);
            bRet =aobj.EvenOdd();

            if(bRet == true)
            {
                System.out.println("Number is Even");
            }
            else
            {
                System.out.println("Number is Odd");
            }
        }
    }
}