//read data in a file 

import java.io.*;
import java.util.*;


class program512
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("_______Marvellous Packer Unpacker CUI Module________");

        System.out.println("Enter file name that you to writing :");
        String File_Name = sobj.nextLine();

        File fobj = new File(File_Name);

        if(fobj.exists())           //
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Arr[] = new byte[20];

            fiobj.read(Arr);
            String str = new String(Arr);
            System.out.println("Data from file is : "+str);

            fiobj.read(Arr);
             str = new String(Arr);
            System.out.println("Data from file is : "+str);
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}