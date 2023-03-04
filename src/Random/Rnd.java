package week3;

import org.w3c.dom.Node;

public class Rnd {
    private int element;
    private Rnd next;

    public Rnd(int e)
    {
        element = e;
    }
    public void link(Rnd next)
    {
        this.next = next;
    }
    public int getElement()
    {
        return element;
    }
    public Rnd getNext()
    {
        return next;
    }
}
class MainSLL
{
    public static void main(String[] args) {
        Rnd one = new Rnd(1);
        Rnd two = new Rnd(3);
        one.link(two);
        Rnd p;
        for(p = one; p!=null; p = p.getNext())
        {
            System.out.println(p.getElement() + " ");
        }
        System.out.println();
    }
}
