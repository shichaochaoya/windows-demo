package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Muster {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("a`");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            String str=(String)iterator.next();
            System.out.println(str);
        }
    }
}
