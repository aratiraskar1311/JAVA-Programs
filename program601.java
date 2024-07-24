//problems on string Approach 2

/*
I/P : Enter string :india is my
O/P : Largest word is : india
    Largest length of word is : 5
 */

import java.util.*;


class program601
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
            String MaxStr = null;

            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i].length() > iMax)
                {
                    iMax = Arr[i].length();
                    MaxStr= Arr[i];
                } 
            }
            System.out.println("Largest word is : "+MaxStr);
            System.out.println("Largest length of word is : "+iMax);

    }
}