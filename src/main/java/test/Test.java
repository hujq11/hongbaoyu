package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Peopel> list = new ArrayList<>();
        Peopel p = new Peopel("1", "强");
        list.add(new Peopel("2","强"));
        list.add(new Peopel("3","强"));
        list.add(p);
        list.add(new Peopel("4","强"));
        list.add(new Peopel("5","强"));
        System.out.println(list.indexOf(p));
        System.out.println(list.indexOf(p));
    }
}
