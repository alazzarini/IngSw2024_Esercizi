package Array_1_07;

public class EsempioSet3
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
        System.out.println(st.getAsString());
    }
}
