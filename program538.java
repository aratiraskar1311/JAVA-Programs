//Unpacking Activity   -- unpacked for first file data

import java.io.*;
import java.nio.file.Files;
import java.util.*;


class program538
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
        String HeaderX = new String(Header);
        System.out.println(HeaderX);

        HeaderX =  HeaderX.trim();

        String Tokens[] = HeaderX.split(" ");

        System.out.println("File name is : "+Tokens[0]);
        System.out.println("File length is : "+Tokens[1]);

        File obj = new File(Tokens[0]);

        obj.createNewFile();

        int FileSize = Integer.parseInt(Tokens[1]);
        byte Buffer[] = new byte[FileSize];

        fiobj.read(Buffer,0,FileSize);

        String Data = new String(Buffer);
        System.out.println("Data from file is : "+Data);
    } 
}
