package JAVA8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("wang","li","zhao");
        //重写Comparator 接口中的 compare（）方法实现排序
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        //使用lambda表达式遍历输出
        names.forEach(System.out::println);
        System.out.println("------------------");
        List<String> names2 = Arrays.asList("wang","li","zhao");
        //使用lambda表达式 简化方法的重写
        Collections.sort(names2 ,(a,b)->b.compareTo(a));
        names2.forEach(System.out::println);
    }
}
