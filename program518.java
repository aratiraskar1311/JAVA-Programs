//To check folder is present or not

import java.io.*;
import java.util.*;


class program518
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("_______Marvellous Packer Unpacker CUI Module________");

        System.out.println("Enter the name of Directory that you want to open :");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists())
        {
            System.out.println("Directory is present");
        }
        else
        {
            System.out.println("There is no such Directory");
        }

        
    }
}