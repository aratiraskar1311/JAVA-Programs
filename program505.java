//create new file

import java.io.*;
import java.util.*;

class program505
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("_______Marvellous Packer Unpacker CUI Module________");

        System.out.println("Enter file name that you to create :");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        boolean bRet = fobj.createNewFile();

        if(bRet == false)
        {
            System.out.println("Unable to craete file");
        }
        else
        {
            System.out.println("File gets successfully created");
        }

    
    }
}