//Singly Linear LinkedList using Java

class node
{
    public int data;
    public node next;

    public node(int Value)              //parametrized constructor
    {
        data = Value;
        next = null;
    }
}

class SinglyLL
 {
    public node First;
    public int iCount;

    public SinglyLL()
    {
        System.out.println("Object of SinglyLL gets created successfully");
        First = null;
        iCount = 0;
    }


    public void InsertFirst(int No)
    {
        node newn = null;

        newn = new node(No);

        if(First == null)
        {
            First = newn;
        }
        else
        {
            newn.next = First;
            First = newn;
        }
        iCount++;
    }

    public void InsertLast(int No)
    {
        node newn = null;
        node temp = null;

        newn = new node(No);

        if(First == null)
        {
            First = newn;
        }
        else
        {
            temp = First;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;    
        }
        iCount++;
    }

    public void DeleteFirst()
    {
        if(First == null)
        {
            System.out.println("LL is empty");
            return;
        }
        else
        {
            First = First.next;
        }
        iCount--;
        
    }

    public void DeleteLast()
    {
        if(First == null)
        {
            System.out.println("LL is empty");
            return;
        }
        else if(First.next == null)                     //single node
        {
            First = null;
        }
        else
        {
           node temp = First;

           while(temp.next.next != null)
           {
            temp = temp.next;
           }
           temp.next = null;
        }
        iCount--; 
    }

    public void Display()
    {
        System.out.println("Elements of the LinkedList are : ");

        node temp = First;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return iCount;
    }

 }


class program413
{
    public static void main(String Arg[])
    {
        SinglyLL obj = new SinglyLL();              //SinglyLL obj   => object cpp
        int iRet = 0;

        obj.InsertFirst(101);
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();
        iRet = obj.Count();

        System.out.println("Number of elements are : "+iRet);

        obj.DeleteFirst();
        obj.Display();
        iRet = obj.Count();

        System.out.println("Number of elements are : "+iRet);

        obj.DeleteLast();
        obj.Display();
        iRet = obj.Count();

        System.out.println("Number of elements are : "+iRet);
    }
}