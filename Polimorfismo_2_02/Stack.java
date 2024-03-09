package Polimorfismo_2_02;

import java.util.*;

public class Stack<E>
{
    private final ArrayList<E> st;

    public Stack()
    { st = new ArrayList<E>(); }
    public void push(E item)
    { st.add(item); }
    public E pop()
    {
        if (!st.isEmpty())
            return st.remove(st.size()-1);  else return null;
    }
    public int getCount()
    { return st.size(); }
}
