package collection.test;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <101 ; i++) {
            list.add(i);
        }
        list.remove(10);
        System.out.println(list);
    }
}
