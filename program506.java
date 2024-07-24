//check file is present in folder

import java.io.*;
import java.util.*;

class program506
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("_______Marvellous Packer Unpacker CUI Module________");

        System.out.println("Enter file name that you to open :");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        if(fobj.exists())           //
        {
            System.out.println("File is present in the folder");
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}