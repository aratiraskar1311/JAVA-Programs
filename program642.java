//Customized DBMS project

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

class program642
{
    public static void main(String Arg[])
    {
        System.out.println("-------------Marvellous Database Management System-------------");
        Employee eobj1 = new Employee("Amit", "Pune",20000);
        Employee eobj2 = new Employee("Sagar", "Mumbai",32000);
        Employee eobj3 = new Employee("Krunal", "Satara",35000);
        Employee eobj4 = new Employee("Rahul", "Nasik",25000);

        eobj1.DisplayInfo();
        eobj2.DisplayInfo();
        eobj3.DisplayInfo();
        eobj4.DisplayInfo();
    }


}