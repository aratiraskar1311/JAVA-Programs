//Unpacking Activity   -- file open and read data

import java.io.*;
import java.util.*;


class program535
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        System.out.println("Length of string is "+str.length());

        str = str.trim();                               //white spaces remove

        System.out.println("Length of string is "+str.length());
    } 
}
