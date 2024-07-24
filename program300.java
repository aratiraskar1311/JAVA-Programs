/*
Enter string :marvellous multi

string length is :16
*/

import java.util.*;

class ArrayX
{
    public String name1;

    public ArrayX(String name2)
    {
        name1 = name2;
    }
    public int Display()
    {
        int i = 0;
        int iCount = 0;

        
        for(i = 0; i < name1.length(); i++)
        {
            if((name1.charAt[i]) != '\0')
            {
                iCount++;
            }
        }
        
        
        return iCount;
    }
    
}

class program300
{
    public static void main(String Arg[])
    {
        Scanner obj = new Scanner(System.in);
        String name;
        int iRet = 0;

        System.out.println("Enter the string :");
        name = obj.nextLine();

        ArrayX aobj = new ArrayX(name);
        iRet = aobj.Display();

        System.out.println("Display count :"+iRet);
    }
}