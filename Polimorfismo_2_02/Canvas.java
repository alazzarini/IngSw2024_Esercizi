package Polimorfismo_2_02;

import java.util.List;

public class Canvas
{
    public void draw(Shape s)
    {
        s.draw(this);
    }

    public void drawAll(List<? extends Shape> shapes)
    {
        for (Shape s: shapes)
            s.draw(this);
    }


    static <T> void arrayToList(T[] a, List<T> c)
    {
        for (T o : a) { c.add(o); }
    }


}
