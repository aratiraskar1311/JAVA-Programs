//Unpacking Activity   -- file open and read data

import java.io.*;
import java.util.*;


class program534
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");          //single word display

        System.out.println("Number of words are : "+Arr.length);

        int i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    } 
}
