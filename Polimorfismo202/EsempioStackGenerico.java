package Polimorfismo202;

class EsempioStackGenerico
{
    public static void main(String[] args)
    {
        Stack<String> s;
        s = new Stack<String>();
        s.push("Ciao");
        s.push("Arrivederci!");
        //System.out.println(s.getCount());
        String x = s.pop();
        //System.out.println(s.getCount());
        System.out.println(x);
        x = s.pop();
        //System.out.println(s.getCount());
        System.out.println(x);
    }
}
