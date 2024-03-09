package Array_1_07;

public class Set
{
    private boolean[] s;
    public Set(int maxNum)
    { s = new boolean[maxNum+1];
        System.out.println("Dimensione set:" + s.length);
    }
    public void add(int n)
    { if (n<s.length) s[n] = true; }
    public void remove(int n)
    { if (n<s.length) s[n] = false; }
    public boolean belongs(int n)
    {
        if (n>=s.length) return false;
        else return s[n];
    }
    public int getCount()
    {
        int n = 0;
        for (int i=0; i<s.length; i++)
            if (s[i]==true) n++;
        return n;
    }
    public String getAsString()
    {
        String x = "{";
        boolean found = false;
        for (int i=0;i<s.length;i++)
        {
            if (belongs(i))
            {
                if (found)
                    x = x+",";
                x = x+i;
                found = true;
            }
        }
        return x+"}";
    }
}
