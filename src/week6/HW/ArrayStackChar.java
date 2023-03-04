package week6.HW;public class ArrayStackChar {
   private final int CAPACITY = 10;
    private char [] data;
    private int size = 0 ;

    public ArrayStackChar()
    {
        data = new char[CAPACITY];
    }
    public ArrayStackChar(char capacity)
    {
        data = new char[capacity];
    }
    public int getSize()
    {
        return size;
    }
    public boolean isEmpty()
    {
        if(size == 0)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public void push(char e)
    {
        if(size == data.length)
        {
            resize();
        }
        data[size] = e;
        size++;
    }
    public int peek()
    {
        if(size == 0)
        {
            return 'N';
        }
        else
        {
            return data[size-1];
        }
    }
    public int pop()
    {
        if(size == 0)
        {
            return 'N';
        }
        else {
            char element = data[size-1];
            size--;
            return element;
        }
    }
    public void resize()
    {
        System.out.println("Double stack's size");
        char[] temp = new char[2*data.length];
        System.arraycopy(data,0, temp, 0, data.length);
        data = temp;
    }
}
