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

    //Insert into Employee values(1,"Sagar","Pune",11000);
    public void InsertIntoTable(String name, String Address, int Salary)
    {
        Employee eobj = new Employee(name,Address,Salary);
        lobj.add(eobj);
    }
    
    //select * from employee
    public void SelectStar()
    {
        System.out.println("Dat from the Employee Database : ");
        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }
    }

    //Select * from employee where Eid = 3;
    public void SelectSpecific(int ID)
    {
        System.out.println("Information of Employee whose EID is : "+ID);

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                eref.DisplayInfo();
                break;
            }
        }
    }

    //Select * from employee where Ename = "Sagar";
    public void SelectSpecific(String Name)
    {
        System.out.println("Information of Employee whose Name is : "+Name);

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.Ename))
            {
                eref.DisplayInfo();
            }
        }
    }

    //delete from Employee where EID = 3;
    public void DeleteFrom(int ID)
    {
        int index = 0;
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bFlag = true;
                break;
            }
            index++;
        }

        if(bFlag == false)
        {
            System.out.println("Unable to delete the element from database as given id is not present");
        }
        else
        {
            lobj.remove(index);
        }
        
    }

    //delete from Employee where Ename = "Sagar";
    public void DeleteFrom(String Name)
    {
        int index = 0;
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.Ename))
            {
                bFlag = true;
                break;
            }
            index++;
        }

        if(bFlag == false)
        {
            System.out.println("Unable to delete the element from database as given id is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    //Select Sum(ESalary) from Employee;
    public void AggregateSum()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }
        System.out.println("Summation of salary : "+iSum);
    }


}

class program658
{
    public static void main(String Arg[])
    {
        System.out.println("-------------Marvellous Database Management System-------------");
        
        MarvellousDBMS mobj = new MarvellousDBMS();
    
        mobj.InsertIntoTable("Sagar Kulkarni","Karve Road Pune 4",11000);
        mobj.InsertIntoTable("Gaurav Sharma","SB Road Nasik",21000);
        mobj.InsertIntoTable("Chinmayee Patil","LB road Mumbai",20000);
        mobj.InsertIntoTable("Akash Sudame","FC road Satara",25000);
        mobj.InsertIntoTable("Mansi Joshi","Panchavati Nasik",12000);

        mobj.SelectStar();

        mobj.SelectSpecific(4);

        mobj.SelectSpecific("Chinmayee Patil");     
        
        mobj.DeleteFrom(4);
        mobj.SelectStar();

        mobj.DeleteFrom(7);

        mobj.DeleteFrom("Gaurav Sharma");
        mobj.SelectStar();

        mobj.AggregateSum();
    }


}