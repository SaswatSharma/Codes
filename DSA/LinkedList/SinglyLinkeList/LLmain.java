public class LLmain {
    public static void main(String args[])
    {
        LL list=new LL();
        list.insertatfirst(5);
        // list.insertatfirst(5);
        // list.insertatfirst(7);
        // list.insertatlast(4);
        // list.insertatindex(6, 3);
        // list.display();
        // list.deletefirst();
        // list.deleteindex(2);
        // list.deletelast();
        // list.display();
        // list.displaysize();
        // System.out.println((list.head).data+" "+(list.tail).data);
        list.deleteindex(0);
        list.display();
    }
}
