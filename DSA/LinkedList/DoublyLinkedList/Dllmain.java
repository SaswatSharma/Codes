package DoublyLinkedList;

public class Dllmain {
    public static void main(String[] args) {
        DLL dll=new DLL();
        dll.insertatindex(10,0);
        dll.insertatlast(20);
        dll.insertatfirst(5);
        dll.insertatindex(15, 2);
        dll.display();
        dll.displayreverse();
    }
}
