package Stringhe_1_06;

class TestSB
{
    public static void main(String[] args)
    {
        String s;
        StringBuffer sb;
        char ch;
        s = "ciao a tutti";
        sb = new StringBuffer(s);
        for (int i=0; i<sb.length()/2; i++)
        {
            ch = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-i-1));
            sb.setCharAt(sb.length()-i-1,ch);
        }
        s = sb.toString();
        System.out.println(s);
    }
}
