
import java.util.*;         //all collection

class program645
{
    public static void main(String Arg[])
    {
        LinkedList <Integer>lobj = new LinkedList <Integer>();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);

        System.out.println(lobj);
        System.out.println("Number of Elements : "+lobj.size());        //size function like Count

        for(int no : lobj)
        {
            System.out.println(no);
        }
    }


}