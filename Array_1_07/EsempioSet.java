package Array_1_07;

public class EsempioSet
{
    public static void main(String[] args)
    {
        Set st;
        st = new Set(250);
        st.add(15);
        st.add(35);
        st.add(18);
        st.remove(35);
        System.out.println("Elementi: "+st.getCount());
    }
}
