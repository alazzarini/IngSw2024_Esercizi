package Array_1_07;

public class EsempioSet2
{
    public static void main(String[] args)
    {
        Set st;
        st = new Set(250);
        for (int i=0;i<args.length;i++)
        {
            int n;
            n = Integer.parseInt(args[i]);
            st.add(n);
        }
        System.out.println("Elementi: "+st.getCount());
        for (int i=0;i<=250;i++)
        {
            if (st.belongs(i))
                System.out.println(""+i);
        }
    }
}

