//existing file data copy into new file (best program)

import java.io.*;
import java.util.*;


class program517
{
    public static void main(String Arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("_______Marvellous Packer Unpacker CUI Module________");

        System.out.println("Enter the source file name :");
        String Source = sobj.nextLine();

        System.out.println("Enter the destination file name :");
        String Destination = sobj.nextLine();

        File sourceobj = new File(Source);

        if(sourceobj.exists())
        {
            File destobj = new File(Destination);

            boolean bret =  destobj.createNewFile();
            if(bret == false)
            {
                System.out.println("Unable to craete new file");
                return;
            }

            FileInputStream fiobj = new FileInputStream(sourceobj);
            FileOutputStream foobj = new FileOutputStream(destobj);

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer,0,iRet);
            }
        }
        
            else
            {
                System.out.println("Unable to complete as Source file is not present");
            }


    }
}