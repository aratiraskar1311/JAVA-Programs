//Customized DBMS project

class Employee
{
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    public Employee(int A, String B, String C, int D)
    {
        this.EID = A;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    public void DisplayInfo()
    {
        System.out.println("EID : "+EID+ " Name :"+Ename+ " Address :"+EAddress+ " Salary :"+ESalary);
    }

}

class program641
{
    public static void main(String Arg[])
    {
        System.out.println("-------------Marvellous Database Management System-------------");
        Employee eobj1 = new Employee(1,"Amit", "Pune",20000);
        Employee eobj2 = new Employee(2,"Sagar", "Mumbai",32000);
        Employee eobj3 = new Employee(3,"Krunal", "Satara",35000);

        eobj1.DisplayInfo();
        eobj2.DisplayInfo();
        eobj3.DisplayInfo();

    }


}