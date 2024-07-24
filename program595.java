//problems on string (best code)

import java.util.*;


class program595
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter string :");
            String str = sobj.nextLine();

           String Arr[] = str.split(" ");

           int i = 0;

            System.out.println("words from the string are : ");
            for(String s : Arr)                         //full array travel krnyasathi                //for(i = 0; i < Arr.length; i++)
            {
                System.out.println(Arr[i]);
            }
    }
}