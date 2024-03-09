package Polimorfismo_2_02;

import java.util.ArrayList;
import java.util.List;

import static Polimorfismo_2_02.Canvas.arrayToList;

public class EsempioWildcards {

    public static void main(String[] args){
    Object[] oa = new Object[100];
    List<Object> co = new ArrayList<Object>();
    arrayToList(oa, co);// T interpretato come Object

    String[] sa = new String[100];
    List<String> cs = new ArrayList<String>();
    arrayToList(sa, cs);// T interpretato come String
    arrayToList(sa, co);// T interpretato come Object

    Integer[] ia = new Integer[100];
    Float[] fa = new Float[100];
    Number[] na = new Number[100];
    List<Number> cn = new ArrayList<Number>();
    arrayToList(ia, cn);// T interpretato come Number
    arrayToList(fa, cn);// T interpretato come Number
    arrayToList(na, cn);// T interpretato come Number
    arrayToList(na, co);// T interpretato come Object
    //arrayToList(na, cs);// errore di compilazione
    }
}
