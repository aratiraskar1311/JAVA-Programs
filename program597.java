//problems on string main code for count number of words.

/*
I/P : Enter string :India is my country
O/P : Number of words are : 4
 */

import java.util.*;


class program597
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter string :");
            String str = sobj.nextLine();

            str = str.trim();

            str = str.replaceAll("\\s+", " ");

           String Arr[] = str.split(" ");

            System.out.println("Number of words are : "+Arr.length);
            
    }
}