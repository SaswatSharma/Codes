public class LL {
     node head;
     node tail;
    private int size;

    LL() {
        this.size = 0;
    }

       class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }

        node(int data, node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertatfirst(int data) {
        size++;
        node first = new node(data);
        first.next = head;
        head = first;
        first = null;
        if (tail == null)
            tail = head;
    }

    public void insertatlast(int data) {
        if (tail == null)
            insertatfirst(data);
        else {
            size++;
            node last = new node(data);
            tail.next = last;
            tail = last;
            last = null;
        }
    }

    public void insertatindex(int data, int index) {
        if (index >= size) {
            System.out.println("Index out of Bounds");
            return;
        }
        size++;
        if (index == 0)
            insertatfirst(data);
        node travel = head;
        int i;
        for (i = 0; i < index - 1; i++)
            travel = travel.next;
        node temp = new node(data, travel.next);
        travel.next = temp;
        temp = null;
        travel = null;
    }

    public void deletefirst()
    {
        System.out.println("Item Deleted->"+head.data);
        if(size==1)
        tail=null;
        size--;
        head=head.next;
    }
    
    public void deletelast()
    {
        if(size==1)
        {
            deletefirst();
            return;
        }
        deleteindex(size-1);
    }

    public void deleteindex(int index)
    {
        if(size==1 && index==0)
        {
            deletefirst();
            return;
        }
        size--;
        node travel=head;
        for(int i=0;i<index-1;i++)
            travel=travel.next;
        System.out.println("Item deleted->"+(travel.next).data);    
        travel.next=(travel.next).next;
        if(index==(size-1))
           tail=travel;
        travel=null;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displaysize() {
        System.out.println(size);
    }

}