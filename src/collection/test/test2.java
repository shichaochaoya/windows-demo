package collection.test;

import java.util.HashSet;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        Set set=new HashSet();//Set集合不能添加重复元素
        set.add("A");
        set.add("a");
        set.add("C");
        set.add("C");
        set.add("a");
        System.out.println(set);
    }
}
