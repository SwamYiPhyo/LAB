package week3.ex1;

public class SLL {
    //-------------Node-------------
    private class Node
    {
        private int element;
        private Node next;
        //constructor
        public Node(int data)
        {
            element = data;
            next = null;
        }
        //link a new node to this node
        public void link(Node newNode)
        {
            next = newNode;
        }
        //return next node
        public Node getNextNode()
        {
            return next;
        }
        //return element of this node
        public int getElement()
        {
            return element;
        }
    }
    //---------------End Node-----------------

    //SLL properties and methods
    private Node head = null;
    private Node tail = null;
    private int size = 0;//SLL'size

    public void addLast(int data)
    {
        //create new node
        Node newNode = new Node(data);
        if(size == 0)
        {
            head = newNode;
        }
        else {
            tail.link(newNode);
        }
        tail = newNode;
        size++;
    }
    public void addFirst(int data)
    {
        Node newNode  = new Node(data);
        if(size == 0)
        {
            tail = newNode;
        }
        else
        {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }
    public void removeFirst()
    {
        if(size == 0)
        {
            System.out.println("null");
        }
        else if(size ==1)
        {
            head = null;
            tail = null;
            size = 0;
        }
        else {
            head = head.next;
            size--;
        }
    }
    public void removeLast()
    {
        if(size == 0)
        {
            System.out.println("null");
        }
        else if(size == 1)
        {
            head = null;
            tail = null;
            size = 0;
        }
        else {
           Node temp = head;
           for(int i=0 ; i<size-2;i++)
           {
               temp = temp.next;
           }
           tail = temp;
           temp.next = null;
           size--;
        }
    }
    public void print()
    {
        if(size == 0)
        {
            System.out.println("Empty linked list");
        }
        else {
            for(Node p = head; p != null; p = p.getNextNode())
            {
                System.out.print(p.getElement() + "->");
            }
            System.out.println("null");
        }
    }
}
//================Mailn class=================
class MainSLL
{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.addFirst(2);
        sll.addLast(3);
        sll.addFirst(1);
        sll.print();
        sll.removeFirst();
        sll.print();
        sll.removeLast();
        sll.print();
    }
}
