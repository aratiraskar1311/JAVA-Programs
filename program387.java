//Singly Circular LinkedList using Java

class node
{
    public int data;
    public node next;

    public node(int value)
    {
        data = Value;
        next = null;
    }
}

class SinglyCL
{
    public node First;
    public node Last;
    public int iCount;

    public SinglyCL()
    {
        System.out.println("Object of SinglyCL gets created successfully");
        First = null;
        Last = null;
        iCount = 0;
    }

    public void InsertFirst(int No)
    {
        node newn = new node(No);

        if((First == null) && (Last == null))
        {
            First = newn;
            Last = newn;
        }
        else
        {
            newn.next = First;
            Last.next = newn;
            First = newn;
        }
        iCount++;
    }

    public void InsertLast(int No)
    {
        node newn = new node(No);

        if(First == null)
        {
            First = newn;
            Last = newn;
        }
        else
        {
            Last.next = newn;
            newn.next = First;
            Last = newn;
            
        }
        iCount++;
    }

    public void Display()
    {
        if((First == null) && (Last == null))
        {
            System.out.println("LL is empty");
            return;
        }

        System.out.println("Element of LL are :");

        System.out.println("->");

        temp = First;
        do
        {
            System.out.println(" |"+temp.data+"->|");
            temp = temp.next;
        }while(Last = First.next); 
    }

public int Count()
{
    return iCount;
}


}

class program387
{
    public static void main(String Arg[])
    {
        SinglyCL obj = new SinglyCL();
        int iRet = 0;

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(151);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of elements are :");
    }
}