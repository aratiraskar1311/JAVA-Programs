import java.io.*;
import java.util.*;

class program507
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
            FileOutputStream foobj = new FileOutputStream(fobj);

            String str = "Marvellous";

            foobj.write(str);                           //error yenar 
        }
        else
        {
            System.out.println("There is no such file");
        }
    }
}