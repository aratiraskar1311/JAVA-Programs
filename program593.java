//problems on string best code for count no. of words 

/*
I/P : Enter string : india   is  my   country
O/P : Number of words are : 4
 */

import java.util.*;


class program593
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter string :");
            String str = sobj.nextLine();

            str = str.trim();                   //trim -> start and end che che white spaces remove

            str = str.replaceAll("\\s+", " ");                //regular expression      //multiple white space replace one space

            char Arr[] = str.toCharArray();

            int iCnt = 0, i = 0;

            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i] == ' ')
                {
                    iCnt++;
                }
            }

            System.out.println("Number of words are : "+(iCnt+1));
    }
}