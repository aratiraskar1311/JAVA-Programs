//All file display in Folder

import java.io.*;
import java.util.*;


class program526
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
            int i = 0, j = 0;

            File Arr[] = fobj.listFiles();      

            System.out.println("Number of files in directory are : "+Arr.length);

            for(i = 0; i < Arr.length; i++)
            {
                String Header = Arr[i].getName();
                Header = Header + " " + Arr[i].length();

                for(j = Header.length(); j < 100; j++)
                {
                    Header = Header + " ";
                }

                System.out.println("Header of first file is :");        //Demo.txt 10
                System.out.println(Header);
    
                System.out.println("Length of Header is : "+Header.length());
    
            }    
        }
        else
        {
            System.out.println("There is no such Directory");
        }

        
    }
}