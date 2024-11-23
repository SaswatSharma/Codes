package DoublyLinkedList;

public class DLL {
    private int size;
    private node head;
    private node tail;
    DLL() {
        this.size = 0;
    }

    private class node {
        private int data;
        private node prev;
        private node next;

        node(int data) {
            this.data = data;
        }
        node(int data,node prev,node next)
        {
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }

    public void insertatfirst(int data)
    {
        node first=new node(data);
        first.next=head;
        first.prev=null;
        if(head!=null)
        head.prev=first;
        head=first;
        if(tail==null)
        tail=head;
    }
    public void insertatlast(int data)
    {
        if(tail==null)
        {
            insertatfirst(data);
            return;
        }
        node last=new node(data,tail,null);
        tail.next=last;
        tail=last;
        last=null;
    }
    public void insertatindex(int data,int index)
    {
        if(index==0)
        {
            insertatfirst(data);
            return;
        }
        if(index==size)
        {
            insertatlast(data);
            return;
        }
        node traverse=head;
        node temp=new node(data);
        for(int i=0;i<index;i++)
        {
            traverse=traverse.next;
        }
        temp.next=traverse;
        temp.prev=traverse.prev;
        traverse.prev.next=temp;
        traverse.prev=temp;
        traverse=null;
    }
    public void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        temp=null;
        System.out.print("End");
    }
    public void displayreverse()
    {
        node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.print("End");
    }
}


