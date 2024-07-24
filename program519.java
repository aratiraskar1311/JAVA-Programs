//To check folder, how many file are folder(count)

import java.io.*;
import java.util.*;


class program519
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
            File Arr[] = fobj.listFiles();      

            System.out.println("Number of files in directory are : "+Arr.length);
        }
        else
        {
            System.out.println("There is no such Directory");
        }

        
    }
}