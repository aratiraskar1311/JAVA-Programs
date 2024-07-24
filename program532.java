//Unpacking Activity   -- file open in packed file and read data

import java.io.*;
import java.util.*;


class program532
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("_______Marvellous Packer Unpacker CUI Module________");

        System.out.println("Enter the name of packed file that you want to open:");
        String PackedFile = sobj.nextLine();

        File fobj = new File(PackedFile);

        if(!fobj.exists())
        {
            System.out.println("Unable to proceed as packed file is missing...");
            return;
        }

        FileInputStream fiobj = new FileInputStream(fobj);

        byte Header[] =  new byte[100];

        fiobj.read(Header);

        System.out.println("Header of first file is : ");
        String H = new String(Header);
        System.out.println(H);
    } 
}
