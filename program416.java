//Doubly Circular LinkedList using Java

class node
{
    public int data;
    public node next;
    public node prev;

    public node(int Value)
    {
        data = Value;
        next = null;
        prev = null;
    }
}

class DoublyCL
 {
    public node First;
    public node Last;
    public int iCount;

    public DoublyCL()
    {
        System.out.println("Object of DoublyCL gets created successfully");
        First = null;
        Last = null;
        iCount = 0;
    }

    public void Display()
    {
        
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int No)
    {
        
    }

    public void InsertLast(int No)
    {
        
    }

    public void DeleteFirst()
    {
        
        
    }

    public void DeleteLast()
    {
        
        
    }

    public void InserAtPos(int No, int iPos)
    {
        
    }

    public void DeleteAtPos(int iPos)
    {
       
    }


 }


class program416
{
    public static void main(String Arg[])
    {
       DoublyCL obj = new DoublyCL();               //object create


    }
}