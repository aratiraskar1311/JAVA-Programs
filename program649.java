//Customized DBMS project

import java.util.*;

class Employee
{
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;
    }

    public Employee(String B, String C, int D)
    {
        this.EID = ++Counter;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    public void DisplayInfo()
    {
        System.out.println("EID : "+EID+ " Name :"+Ename+ " Address :"+EAddress+ " Salary :"+ESalary);
    }

}

class MarvellousDBMS
{
    public LinkedList <Employee> lobj;

    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS Stsrted Successfully...");
        lobj = new LinkedList<Employee>();
    }
\
}

class program649
{
    public static void main(String Arg[])
    {
        System.out.println("-------------Marvellous Database Management System-------------");
        
        MarvellousDBMS mobj = new MarvellousDBMS();
    
        
    }


}