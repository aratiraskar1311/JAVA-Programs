//problems on string 

/*
I/P : Enter string : india is my country
O/P : words from the string are :
        india
        is
        my
        country
 */

import java.util.*;


class program594
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter string :");
            String str = sobj.nextLine();

           String Arr[] = str.split(" ");

           int i = 0;

            System.out.println("words from the string are : ");
            for(i = 0; i < Arr.length; i++)
            {
                System.out.println(Arr[i]);
            }
    }
}