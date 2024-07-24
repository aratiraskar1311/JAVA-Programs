//problems on string 

/*
 *I/P : Enter string : india is my country
O/P : Largest length of word is : 7
 */

import java.util.*;


class program599
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter string :");
            String str = sobj.nextLine();

            str = str.trim();

            str = str.replaceAll("\\s+", " ");

            String Arr[] = str.split(" ");

            int i = 0;
            int iMax = 0;

            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i].length() > iMax)
                {
                    iMax = Arr[i].length();
                } 
            }
            System.out.println("Largest length of word is : "+iMax);
    }
}